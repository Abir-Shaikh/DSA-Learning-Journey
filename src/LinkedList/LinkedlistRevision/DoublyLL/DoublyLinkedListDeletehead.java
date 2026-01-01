package LinkedList.LinkedlistRevision.DoublyLL;

public class DoublyLinkedListDeletehead {
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

    private static Node DeleteHead(Node head){
        //edge case
        if (head == null || head.next == null) {
            return null;
        }
        Node oldHead = head;
        head = head.next;

        head.prev = null;
        oldHead.next = null;

        return head;
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

    static void main(String[] args) {
        int[] arr = {12 , 15 , 17 , 19};

        Node head = convertArrtoDLL(arr);
        System.out.print("Before Deleting head : ");
        traverse(head);

        head = DeleteHead(head);

        System.out.print("After Deleting head : ");
        traverse(head);
    }
}
