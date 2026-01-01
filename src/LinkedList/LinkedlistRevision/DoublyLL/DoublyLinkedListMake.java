package LinkedList.LinkedlistRevision.DoublyLL;

public class DoublyLinkedListMake {
    public static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    };

    public static void traverse(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " <-> ");
            temp=temp.next;
        }
        System.out.print("null");
    }

    Node head ;
    Node tail ;

    static void main() {
        DoublyLinkedListMake doublyLinkedListMake = new DoublyLinkedListMake();
        Node n1 = new Node(12);
        Node n2 = new Node(15);
        Node n3 = new Node(16);
        Node n4 = new Node(19);

        doublyLinkedListMake.head = n1;
        n1.next = n2;

        n2.prev = n1;
        n2.next = n3;

        n3.prev = n2;
        n3.next = n4;

        n4.prev = n3;
        doublyLinkedListMake.tail = n4;

        traverse(doublyLinkedListMake.head);
    }
}
