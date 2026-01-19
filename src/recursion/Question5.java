package recursion;

public class Question5 {
    static Boolean palindrome(String str , int start , int end){
        if (start >= end) {
            return true;
        }
        return  (str.charAt(start) == str.charAt(end) && palindrome(str, start+1, end -1));
    }
    public static void main(String[] args) {
        String test = "kppappk";
        boolean result = palindrome(test, 0, test.length()-1);
        if (result) {
            System.out.println("String: " + test);
            System.out.println("it is a palindrome");
        }else {
            System.out.println("String: " + test);
            System.out.println("not a palindrome");
        }
    }
}

