package revisionAll;

public class ExceptionQuestion3 {
    static void main(String[] args) {

        //finally block will always execute even if the catch block is not executed.
        try {
            //int a = 10 / 2;
            int a = 10 / 2;
            System.out.println(a);
        }catch (ArithmeticException E){
            System.out.println("Catch block executed...");
        }finally {
            System.out.println("finally block executed....");
        }
    }
}
