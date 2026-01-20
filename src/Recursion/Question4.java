package Recursion;

public class Question4 {

    public void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Question4 obj = new Question4();

        int n = 41;
        System.out.print("Numbers -> ");
        obj.printNumbers(n);
    }
}
