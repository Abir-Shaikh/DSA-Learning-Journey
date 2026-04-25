package revisionAll.LinkedListRevision;

public class dllDeletion {

    public static class Node{
        int data;
        Node next ;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private static void traverse(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node convertArrToDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            temp.prev = prev;
            prev = temp;
        }
        return head;
    }

    public static Node deleteHead(Node head){
        if (head == null || head.next == null) return null;

        Node oHead = head;
        head = head.next;
        head.prev = null;
        oHead.next = null;
        return head;
    }

    public static Node deleteTail(Node head){
        if (head == null||head.next == null) return null;

        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }

        Node nTail = tail.prev;
        nTail.next = null;
        tail.prev = null;

        return head;
    }

    public static Node deleteKth(Node head , int k){
        if (head == null) return null;
        if (k==1) return deleteHead(head);

        int ctr = 1;
        Node kth = head;
        while (ctr != k){
            kth = kth.next;
            ctr++;
        }

        Node prev1 = kth.prev;
        Node next1 = kth.next;
        prev1.next = next1;

        if (next1 != null){
            next1.prev = prev1;
        }

        kth.next = null;
        kth.prev = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12 , 14 , 5 , 7 , 9};
        Node head = convertArrToDLL(arr);

        System.out.println("Before : ");
        traverse(head);

        head = deleteKth(head , 2);

        System.out.println("After : ");
        traverse(head);
    }
}
