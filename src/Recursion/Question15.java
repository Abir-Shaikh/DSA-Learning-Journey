package Recursion;

//Print odd numbers from 1 to n using recursion.
public class Question15 {
    static void odd(int n ){
        if (n <= 0) {
            return;
        }
        odd(n-1);
        if (n % 2 != 0) {
            System.out.println(n);
        }
    }

    static void main(String[] args) {
        System.out.println("The odd numbers are : ");
        odd(20);
    }
}
