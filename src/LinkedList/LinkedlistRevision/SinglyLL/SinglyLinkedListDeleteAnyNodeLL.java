package LinkedList.LinkedlistRevision.SinglyLL;

public class SinglyLinkedListDeleteAnyNodeLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    };

    public static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node deleteAnyNode(Node head , int k){
        //edge case
        if (head == null) {
            return null;
        }
        //custom for 1st input
        if (k == 1) {
            head = head.next;
            return head;
        }
        //custom for all inputs
        int counter = 0 ;
        Node temp = head;
        Node prev = null;

        while( temp != null){
            counter++;
            if (counter == k) {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }



    static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(6);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(10);

        System.out.println("Before deleting head: ");
        traverse(head);

        head = deleteAnyNode(head , 3);

        System.out.println("After deleting head: ");
        traverse(head);
    }
}