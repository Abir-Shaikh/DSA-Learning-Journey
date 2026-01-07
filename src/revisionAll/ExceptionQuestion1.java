package revisionAll;

public class ExceptionQuestion1 {
    static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        }catch (ArithmeticException E){
            System.out.println("Cannot divide by zero...");
        }
        System.out.println("Program Ends....");
    }
}
