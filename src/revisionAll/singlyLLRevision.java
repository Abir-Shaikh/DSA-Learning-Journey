package revisionAll;

public class singlyLLRevision {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    };

    static Node head;
    public static void traverse(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static boolean search(int val){
        Node temp = head;
        while (temp != null){
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //delete haed from LL
    public static Node deleteHead(Node head){
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    //delete head from tail

    public static Node deleteTail(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }


    //delete head from kth element
    public static Node deleteKthElement(Node head , int k){
        if (head == null) {
            return null;
        }
        if (k == 1) {
            Node temp = head;
            temp = temp.next;
            return head;
        }
        int ctr = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null){
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

    //insert at head
    public static Node insertHead(Node head , int val){
            Node node = new Node(val);
            node.next = head;
            return node;
    }

    //insert at tail
    public static Node insertTail(Node head , int val){
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next = node;
        return head;
    }


    //insert at kth element

    public static Node insertKth(Node head , int element , int k){
        if(k == 1){
            Node node = new Node(element);
            node.next = head;
            return node;
        }
        int ctr = 0;
        Node temp = head;
        while (temp != null){
            ctr++;

            if(ctr == k-1){
                Node x = new Node(element);
                x.next = temp.next;
                temp.next = x;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        //3 , 4 , 6 , 7
        Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(7);

//        System.out.print("Before searching : ");
//        traverse(head);

//        int val = 10;
//        if (search(val)) {
//            System.out.println("Element found...");
//        }else {
//            System.out.println("Element not found...");
//        }

//        System.out.print("Before deleting : ");
//        traverse(head);
//
//        head = deleteHead(head);
//
//        System.out.print("After deleting : ");
//        traverse(head);

//        System.out.print("Before deleting : ");
//        traverse(head);
//
//k
//        System.out.print("After deleting : ");
//        head = deleteTail(head);
//        traverse(head);

//        System.out.print("Before deleting : ");
//        traverse(head);
//
//
//        System.out.print("After deleting : ");
//        head = deleteKthElement(head , 2);
//        traverse(head);

//        System.out.print("Before inserting : ");
//        traverse(head);
//
//
//        System.out.print("After inserting : ");
//        head = insertHead(head , 2);
//        traverse(head);

        System.out.print("Before inserting : ");
        traverse(head);


        System.out.print("After inserting : ");
        head = insertKth(head , 2 , 3);
        traverse(head);
    }
}
