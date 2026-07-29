package stack;

public class removeAdjacentDuplicates {
    public static String removeduplicates(String s){

        StringBuilder stack = new StringBuilder();

        for(char c : s.toCharArray()){
            if (stack.length() > 0 && stack.charAt(stack.length() - 1) == c) {
                stack.deleteCharAt(stack.length() - 1);
            }else {
                stack.append(c);
            }
        }
        return stack.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeduplicates("abbaca"));
        System.out.println(removeduplicates("acaabbcc"));
        System.out.println(removeduplicates("xyxzxxy"));
    }
}
