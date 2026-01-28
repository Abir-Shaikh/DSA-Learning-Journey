package Recursion;

//Print numbers from 5 to 1 using recursion without loops.
public class Question12 {
    static void without_Loops(int n){
        if(n == 0) return;
        System.out.println(n + " ");
        without_Loops(n-1);
    }

    static void main(String[] args) {
        System.out.println("The numbers are : ");
        without_Loops(5);
    }
}
