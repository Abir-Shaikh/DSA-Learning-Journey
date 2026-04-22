package revisionAll.LinkedListRevision;

import com.sun.source.tree.BreakTree;

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

    //delete tail
    public static Node deleteTail(Node head){
        if (head == null || head.next == null) return null;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    //delete kth
    public static Node deleteKth(Node head , int k) {
        if (head == null) return null;

        if (k == 1) {
            return head.next;
        }

        Node temp = head;
        int ctr = 0;
        Node prev = null;
        while (temp != null) {
            ctr++;
            if (ctr == k) {
                prev.next = prev.next.next;
                break;
            }
        prev = temp;
        temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(12);

        System.out.println("Before Deleting : ");
        traverse(head);

        head = deleteKth(head , 3);

        System.out.println("After deleting : ");
        traverse(head);
    }
}
