package LinkedList.LinkedlistRevision.SinglyLL;

public class SinglyLinkedListDeleteHeadLL {
    public static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    };

    public static void traverse(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node removesHead(Node head){
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(6);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(10);

        System.out.println("Before deleting head: ");
        traverse(head);

        head = removesHead(head);

        System.out.println("After deleting head: ");
        traverse(head);
    }
}
