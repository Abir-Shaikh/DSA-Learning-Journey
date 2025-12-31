package LinkedList.LinkedlistRevision.SinglyLL;

public class SinglyLinkedListInsertAtKth {
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

    public static Node insertAtKthElement(Node head , int element , int k){
        //checking for 1st element
        if (k == 1) {
            Node newnode  = new Node(element);
            newnode.next = head;
            return newnode;
        }
        int counter = 0;
        Node temp = head;
        while (temp != null){
            counter++;
            if (counter == k-1) {
                Node x = new Node(element);
                x.next = temp.next;
                temp.next = x;
                return head;
            }
            temp = temp.next;
        }

        // if k is greater than length
        return head;
    }

    static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(6);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(10);

        System.out.println("Before inserting head: ");
        traverse(head);

        head = insertAtKthElement(head , 100 , 3);

        System.out.println("After inserting head: ");
        traverse(head);
    }
}
