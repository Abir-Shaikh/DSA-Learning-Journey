package stack;

import java.util.Stack;

public class reverseWordInString {
    public static void main(String[] args) {
        String str = "I Hate DSA";
        Stack<String> stack = new Stack<>();

        String[] word = str.trim().split(" ");
        for (int i = 0; i < word.length; i++) {
            stack.push(word[i]);
        }
        StringBuilder s = new StringBuilder();

        while (!stack.isEmpty()){
            s.append(stack.pop()).append(" ");
        }
        System.out.println(s);
    }
}
