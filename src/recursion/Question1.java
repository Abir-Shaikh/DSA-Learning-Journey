package recursion;

public class Question1 {

        public static void main(String[] args) {
            System.out.println(show(5));
        }
        public static int show(int n){
            if (n == 0) {
                return 0;
            }
            show(n -1);
            return n + show(n-1);
        }
    }

