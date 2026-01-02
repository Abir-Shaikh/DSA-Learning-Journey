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

    public static Node InsertBeforeTail{

    }
}
