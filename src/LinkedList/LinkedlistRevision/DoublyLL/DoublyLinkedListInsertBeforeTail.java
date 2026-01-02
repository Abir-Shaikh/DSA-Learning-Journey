package LinkedList.LinkedlistRevision.DoublyLL;

public class DoublyLinkedListInsertBeforeTail {
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

    public static Node InsertBeforeTail(Node head , int val){
        //edge case
        if(head == null) return new Node(val);

        //for single node list
        if (head.next == null) {
            return InsertBeforeTail(head, val);
        }
        //find tail
        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        Node prev = tail.prev;
        Node newNode = new Node(val);
        //link new node
        prev.next = newNode;
        newNode.prev = prev;

        newNode.next = tail;
        tail.prev = newNode;

        return head;

    }

    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Node head = convertArrtoDLL(arr);

        System.out.println("Before insertion:");
        traverse(head);

        head = InsertBeforeTail(head, 99);

        System.out.println("After inserting before tail:");
        traverse(head);
    }
}
