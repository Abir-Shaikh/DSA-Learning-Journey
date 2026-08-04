package Tree.DFS;

import Tree.Node;

public class InorderTraversal {
    public static void inorder(Node root){
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node elements = new Node(77);
        elements.left = new Node(99);
        elements.right = new Node(45);
        elements.left.left = new Node(50);
        elements.left.right = new Node(38);
        elements.right.right = new Node(99);
        inorder(elements);
    }
}
