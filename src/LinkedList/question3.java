package LinkedList;
//Insert at the beginning of doubly linked list


public class question3 {
    static class Node {
        int data;

        Question2.Node prev;
        Question2.Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Question2.Node head;
    Question2.Node tail;

    public static void main(String[] args) {

        question3 dll = new Question2();
        Question2.Node n1 = new Question2.Node(10);
        Question2.Node n2 = new Question2.Node(20);
        Question2.Node n3 = new Question2.Node(30);

        dll.head = n1;
        n1.next = n2;

        n2.prev = n1;
        n2.next = n3;

        n3.prev = n2;
        dll.tail = n3;


    }
}

}
