package stack;

import java.util.Stack;

public class reverseOfString {
    public static void main(String[] args) {

        String str = "I love Java";

        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();

        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        System.out.println(reversed);
    }
}
