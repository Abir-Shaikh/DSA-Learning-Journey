package revisionAll.recursion;

public class q4 {
    public static int sumcalc(int n){
        if (n <= 0) {
            return 0;
        }
        return n + sumcalc(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumcalc(5));
    }

}
