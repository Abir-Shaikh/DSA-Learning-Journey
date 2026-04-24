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
            temp.prev = prev;
            prev = temp;
        }
        return head;
    }

    private static Node InsertBeforeHead(Node head , int val){
        Node newHead = new Node(val);
        newHead.next = head;
        if(head!= null) head.prev = newHead;
        return newHead;
    }

    private static Node InsertBeforeTail(Node head , int element){
        if(head == null) return new Node(element);

        if(head.next == null) return InsertBeforeHead(head , element);

        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        Node prev = tail.prev;//reference rakhlam
        Node newNode = new Node(element);//new element
        prev.next = newNode;//40s next = new
        newNode.prev = prev;//new's prev = 40s prev
        newNode.next = tail;//new's next = 50s
        tail.prev = newNode;//50s prev = new

        return head;
    }

    private static Node InsertBeforeKthElement(Node head , int element , int k){
        if(head == null) return new Node(element);

        if(k == 1) return InsertBeforeHead(head , element);

        int counter = 1;
        Node temp = head ;

        while (counter != k-1){
            temp = temp.next;
            counter++;
        }
            Node newNode = new Node(element);
            Node x = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = x;
            x.prev = newNode;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30 , 40 , 50};
        Node head = convertArrtoDLL(arr);


        System.out.println("Before : ");
        traverse(head);

        head = InsertBeforeKthElement(head , 8 , 2);

        System.out.println("After : ");
        traverse(head);


//
//        int[] arr = {10};
//        Node head = convertArrtoDLL(arr);
//
//        System.out.println("Before : ");
//        traverse(head);
//
//        head = InsertBeforeKthElement(head, 8 ,1);
//
//        System.out.println("After : ");
//        traverse(head);
    }
}
