package LinkedList.LinkedlistRevision.DoublyLL;

public class DoublyLinkedListDeleteKthNode {
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

    //Delete tail node
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

    //Delete head node
    public static Node DeleteHead(Node head){
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


    //Remove the kth element
    public static Node RemoveKthElemnt(Node head , int k){
        //edge case
        if (head == null) {
            return null;
        }
        //By this block we can pinpoint temp which is standing at kNode
        int count = 0;
        Node kNode = head;
        while (kNode != null){
            count++;
            if (count == k) break;
            kNode = kNode.next;
        }
        Node prev = kNode.prev;
        Node front = kNode.next;

        //checking for every element
        if (prev == null && front == null){ //for singly element
            return null;
        } else if (prev == null) {
            return DeleteHead(head);
        } else if (front == null) {
            return DeleteTail(head);
        }


        //when I am deleting middle node no head or tail node
        prev.next = front;
        front.prev = prev;

        kNode.next = null;
        kNode.prev = null;

        return head;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        Node head = convertArrtoDLL(arr);

        System.out.println("Before deletion:");
        traverse(head);

        head = RemoveKthElemnt(head, 3);

        System.out.println("After deleting 3rd node:");
        traverse(head);
    }
}
