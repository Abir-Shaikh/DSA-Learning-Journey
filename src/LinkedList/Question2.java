package LinkedList;
//create a double linked list.

public class Question2 {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public static void main(String[] args) {

        Question2 dll = new Question2();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        dll.head = n1;
        n1.next = n2;

        n2.prev = n1;
        n2.next = n3;

        n3.prev = n2;
        dll.tail = n3;


    }
}
