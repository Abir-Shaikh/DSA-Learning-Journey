package revisionAll.recursion;

public class q5 {
    public static int fact(int n){
        if (n == 0) {
            return 1;
        }
        return n * (n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(0));
    }
}
