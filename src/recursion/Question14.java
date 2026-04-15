package Recursion;

//Print even numbers from 1 to n using recursion.
public class Question14 {
    static void even(int n ){
        if (n <= 0) {
            return;
        }
        //gives ascending
        even(n-1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
//      gives descending
        //even(n-1);
    }

    static void main(String[] args) {
        System.out.println("The Even numbers are : ");
        even(20);
    }
}
