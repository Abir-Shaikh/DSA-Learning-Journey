package Recursion;

//Print numbers from 1 to n using recursion.
public class Question13 {
    static void prints(int n){
        if (n == 0) {
            return;
        }
        prints(n-1);
        System.out.println(n + " ");
    }
    static void main(String[] args) {
        System.out.println("Numbers Printed using recursion : ");
        prints(6);
    }
}
