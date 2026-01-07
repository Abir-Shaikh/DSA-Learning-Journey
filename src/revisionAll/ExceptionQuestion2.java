package revisionAll;

public class ExceptionQuestion2 {
    public static void main(String[] args) {
        try {
            //here only Array index out of bound will execute why?
            //cuz think if u r in a building which has three rooms and it caught fire what will a normal
            //person do it will immediately get out from that building
            //just like that if the code saw any error it will stop the process and jump to catch block and then
            //it will execute only the first exception and then it will go out from the try catch block and print
            //End of program
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);

            int a = 10 / 0;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

        System.out.println("End of program");
    }
}
