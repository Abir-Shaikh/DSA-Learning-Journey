package Recursion;

public class Question3 {
    static void main(String[] args) {
        System.out.println("Fibonacchi -> " + fibonacchi(7));
    }
    public static int fibonacchi(int i){
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return fibonacchi(i-2) + fibonacchi(i-1);
    }
}
