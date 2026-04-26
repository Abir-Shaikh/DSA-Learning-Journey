package revisionAll.recursion;

public class q2 {
    public static void printName(int n , String name){
        if (n == 0) {
            return;
        }
        System.out.println(name);
        printName(n-1 , name);
    }

    public static void main(String[] args) {
        printName(10000 , "Abir");
    }
}
