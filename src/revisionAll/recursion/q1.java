package revisionAll.recursion;

public class q1 {
    public static void printName(int n){
        if (n == 0) {
            return;
        }
        System.out.println("Hello");
        printName(n-1);
    }

    public static void main(String[] args) {
        printName(10);
    }
}
