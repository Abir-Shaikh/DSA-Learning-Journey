package LinkedList.LinkedlistRevision.DoublyLL;

public class DoublyLinkedListDeleteTail {
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
        System.out.println("null");
    }

    public static Node convertArrtoDLL(int[] arr){
        //edge case
        if (arr.length == 0) {
            return null;
        }
        //assigning head and prev
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node curr = new Node(arr[i]);
            curr.prev = prev;
            prev.next = curr;
            prev = curr;
        }
        return head;
    }

    public static Node DeleteTail(Node head){
        //edge case
        if (head == null || head.next == null) {
            return null;
        }

        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        Node newTail = tail.prev;
        newTail.next = null;
        tail.prev = null;
        return head;
    }

    static void main(String[] args) {
        int[] arr = {12, 15, 17, 19};

        Node head = convertArrtoDLL(arr);

        System.out.print("Before deleting tail : ");
        traverse(head);

        head = DeleteTail(head);

        System.out.print("After deleting tail : ");
        traverse(head);
    }
}
