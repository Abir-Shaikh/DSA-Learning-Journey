package revisionAll.LinkedListRevision;

public class l1 {
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
    public static Node DeleteHead(Node head){
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    //delete tail
    public static Node DeleteTail(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    //delete at any position
    public static Node DeleteAtanyPosition(Node head , int k){
        if (head == null) {
            return head;
        }
        if(k == 1){
            head = head.next;
            return head;
        }
        int counter = 0;
        Node prev = null;
        Node temp = head;


        while (temp != null){
            counter++;
            if (counter == k) {
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

        head = DeleteAtanyPosition(head , 4);

        System.out.println("After deleting : ");
        traverse(head);
    }
}
