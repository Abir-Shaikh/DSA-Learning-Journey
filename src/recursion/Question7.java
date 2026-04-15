package recursion;

//power using recursion
public class Question7 {
        static int recursivePower(int n , int p){
            if(p == 0){
                return 1;
            }
            return n*recursivePower(n , p-1);
        }
    public static void main(String[] args) {
        int n = 2;
        int p = 17;

        int result = recursivePower(n , p);
        System.out.println("Result = " + result);
    }
}
