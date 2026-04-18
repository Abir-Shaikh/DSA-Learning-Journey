package revisionAll.LinkedListRevision;

public class singlyLinkedList {
    public static class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void traverse(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    //insert at head
    public static Node insertAtHead(Node head , int val){
        Node node = new Node(val);
        node.next = head;
        return node;
    }

    //insert at tail
    public static Node insertAtTail(Node head , int val){
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next = node;
        return head;
    }

    //insert at kth elememnt
    public static Node insertAtKth(Node head , int val , int k){
        if (head == null) return null;

        //for 1st element
        if (k == 1) {
            Node node = new Node(val);
            node.next = head;
            return node;
        }
        int counter = 0;
        Node temp = head;
        while (temp!= null){
            counter++;
            if (counter == k-1) {
                Node x = new Node(val);
                x.next = temp.next;
                temp.next = x;
                return head;
            }
        temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(6);
        head.next.next.next = new Node(7);

        System.out.println("Before inserting head: ");
        traverse(head);

        head = insertAtKth(head , 5 , 5);

        System.out.println("After inserting head: ");
        traverse(head);
//        Node head = null;
//        Node result = insertAtKth(head, 5, 1);
//        System.out.println("Inserting into null list: ");
//        traverse(result);
    }
}
