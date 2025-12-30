package LinkedList.LinkedlistRevision;

public class SinglyLinkedListMake {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    };

    public static void main(String[] args) {
        int[] arr = {1 , 3 , 6 , 8};
        Node node = new Node(arr[3]);
        System.out.println("Found : " + node.data);
    }
}
