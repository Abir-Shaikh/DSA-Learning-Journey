package LinkedList.LinkedlistRevision.DoublyLL;

public class DoublyLinkedListInsertBeforeAnyNode {
    public static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    };

    public static void traverse(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " <-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static Node convertArrtoDLL(int[] arr){
        //edge case
        if (arr.length == 0) {
            return null;
        }
        //assigning head and prev
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node curr = new Node(arr[i]);
            curr.prev = prev;
            prev.next = curr;
            prev = curr;
        }
        return head;
    }

    public static Node InsertBeforeHead(Node head , int val){
        Node newHead = new Node(val);


        if (head == null) {
            return newHead;
        }

        newHead.next = head;
        head.prev = newHead;
        return newHead;
    }


    public static void InsertBeforeNode(Node node, int val) {
        Node prev = node.prev;
        Node newNode = new Node(val);

        newNode.prev = prev;
        prev.next = newNode;

        newNode.next = node;
        node.prev = newNode;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Node head = convertArrtoDLL(arr);

        System.out.println("Before insertion:");
        traverse(head);

        InsertBeforeNode(head.next , 100);

        System.out.println("After before inserting at kth element : ");
        traverse(head);
    }
}


