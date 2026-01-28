package Recursion;
//Write a recursive function that prints "Hello" exactly 5 times.
public class Question10 {
    static void print(int n){
        if (n == 0) return;
        System.out.println("Hello");
        print(n-1);
    }

    static void main(String[] args) {
        print(5);
    }
}
