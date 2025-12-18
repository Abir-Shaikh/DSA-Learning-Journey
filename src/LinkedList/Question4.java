package LinkedList;
// insert at the end of Doulby Linked List.


public class Question4 {
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

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " - ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {

        Question4 dll = new Question4();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        dll.head = n1;
        n1.next = n2;

        n2.prev = n1;
        n2.next = n3;

        n3.prev = n2;
        dll.tail = n3;
        
        dll.insertAtEnd(3);
        dll.display();
    }
}

