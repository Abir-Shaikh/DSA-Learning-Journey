package revisionAll.LinkedListRevision;

public class singlyLinkedList {
    public static class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void traverse(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    //insert at head
    public static Node insertAtHead(Node head , int val){
        Node node = new Node(val);
        node.next = head;
        return node;
    }

    //insert at tail
    public static Node insertAtTail(Node head , int val){
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next = node;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(6);
        head.next.next.next = new Node(7);

        System.out.println("Before inserting head: ");
        traverse(head);

        head = insertAtTail(head , 5);

        System.out.println("After inserting head: ");
        traverse(head);
    }
}
