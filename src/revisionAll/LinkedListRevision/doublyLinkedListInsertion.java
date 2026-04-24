package revisionAll.LinkedListRevision;


public class doublyLinkedListInsertion {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private static void traverse(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node convertArrtoDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30 , 40 , 50};
        Node head = convertArrtoDLL(arr);


        System.out.println("Before : ");
        traverse(head);

        head = convertArrtoDLL(arr);

        System.out.println("After : ");
        traverse(head);
    }
}
