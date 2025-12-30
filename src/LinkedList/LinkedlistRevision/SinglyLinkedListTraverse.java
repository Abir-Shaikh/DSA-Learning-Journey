package LinkedList.LinkedlistRevision;

public class SinglyLinkedListTraverse {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    };
    Node head;
    public void traverse(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1 , 3 , 6 , 8};
        SinglyLinkedListTraverse list = new SinglyLinkedListTraverse();

        list.head = new Node(arr[0]);
        Node temp = list.head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;

        }
        list.traverse();
    }
}
