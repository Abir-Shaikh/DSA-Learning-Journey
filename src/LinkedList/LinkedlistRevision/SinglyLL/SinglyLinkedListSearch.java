package LinkedList.LinkedlistRevision.SinglyLL;

public class SinglyLinkedListSearch {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Traverse
    public void traverse() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //  SEARCH method
    public boolean search(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return true;   // element found
            }
            temp = temp.next;
        }
        return false; // element not found
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 8};
        SinglyLinkedListSearch list = new SinglyLinkedListSearch();

        // Create linked list
        list.head = new Node(arr[0]);
        Node temp = list.head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        // Traverse list
        list.traverse();

        // Search element
        int key = 10;

        if (list.search(key)) {
            System.out.println("Element " + key + " found in the list");
        } else {
            System.out.println("Element " + key + " not found in the list");
        }
    }
}
