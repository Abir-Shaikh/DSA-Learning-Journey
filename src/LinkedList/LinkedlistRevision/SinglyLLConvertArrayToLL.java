package LinkedList.LinkedlistRevision;

public class SinglyLLConvertArrayToLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    };

    private static Node Convert2toLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1 , 3 , 6 , 8};
        Node head = Convert2toLL(arr);
        System.out.println(head.data);
    }
}

