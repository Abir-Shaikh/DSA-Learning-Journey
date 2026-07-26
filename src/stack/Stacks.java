package stack;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("stack : " + stack);

        System.out.println("popped element : " + stack.pop());
        System.out.println("stack : " + stack);

        System.out.println("peek : " + stack.peek());
        System.out.println("stack : " + stack);

        System.out.println("isEmpty : " + stack.isEmpty());
        System.out.println("size : " + stack.size());

        System.out.println("search : " + stack.search(20));
    }
}
