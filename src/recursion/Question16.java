package Recursion;

//Find the sum of first n natural numbers using recursion.
public class Question16 {
    static int sum(int n ){
        if (n <= 0) {
           return 0;
        }
        return n + sum(n-1);
    }

    static void main(String[] args) {
        System.out.print("Sum is : ");
        System.out.println(sum(1000));
    }
}
