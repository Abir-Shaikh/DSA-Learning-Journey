package Recursion;

public class Question2 {
    static void main(String[] args) {
        System.out.println("Factorial -> " + factorial(5));
    }
    public static int factorial(int n){
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
