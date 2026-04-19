package revisionAll.LinkedListRevision;

public class singlyLinkedList_Deletion {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void traverse(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //delete head
    public static Node deleteHead(Node head){
        if (head == null) return null;

        return head.next;
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(12);

        System.out.println("Before Deleting : ");
        traverse(head);

        head = deleteHead(head);

        System.out.println("After deleting : ");
        traverse(head);
    }
}
