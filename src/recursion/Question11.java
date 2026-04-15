package Recursion;

//Print numbers from 1 to 5 using recursion without parameters.
public class Question11 {
    static void params(int n){
        if(n == 0) return;
        params(n-1);
        System.out.println(n + " ");
    }
    static void main(String[] args) {
        System.out.println("The numbers are : ");
        params(5);
    }
}
