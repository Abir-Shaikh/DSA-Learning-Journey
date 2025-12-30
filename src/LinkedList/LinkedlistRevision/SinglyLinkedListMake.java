package LinkedList.LinkedlistRevision;

public class SinglyLinkedListMake {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    };

    static void main(String[] args) {
        int[] arr = {1 , 3 , 6 , 8};
        Node node = new Node(arr[3]);
        System.out.println("Found : " + node.data);
    }
}
