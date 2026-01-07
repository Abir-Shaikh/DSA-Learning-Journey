package revisionAll;

public class ExceptionQuestion4 {

    static void vote(int age){
        if (age <= 18) {
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("U can vote");
    }
    static void main(String[] args) {
        vote(5);
    }
}
