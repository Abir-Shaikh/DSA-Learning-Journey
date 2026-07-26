/*Create an empty stack.

        traverse the whole array

        For every character:

        If it is '(', '{', '['
        Push it.

        Else
        If stack is empty
        return false

        Pop the top.

        If brackets don't match
        return false

        After processing all characters:

        If stack is empty
        return true
        Else
        return false*/

package stack;

import java.util.Stack;

public class balancedParenthesis {
    public static boolean checkBalancedParenthesis(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return false;
            }else {
                char top = stack.pop();
                if (ch == ')' && top != '(' ||
                        ch == '}' && top != '{' ||
                        ch == ']' && top != '[') {

                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(checkBalancedParenthesis("{[()]}"));
        System.out.println(checkBalancedParenthesis("{[(])}"));
        System.out.println(checkBalancedParenthesis(""));
        System.out.println(checkBalancedParenthesis("((("));
    }
}
