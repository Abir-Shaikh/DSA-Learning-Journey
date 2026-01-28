package Recursion;

//Find the factorial of a number using recursion.
public class Question17 {
    static int factorial(int n){
        if (n <= 1) {
           return 1;
        }
        return n * factorial(n-1);
    }
    static void main(String[] args) {
        System.out.print("The factorial of the number is : ");
        System.out.print(factorial(10));
    }
}
