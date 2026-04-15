package recursion;

public class Question8 {

     void subset(String str , String r , int counter  ){
        //base case
        if (counter == str.length()) {
            System.out.println("subsequences are : "+r);
            return;
        }

        subset(str , r , counter+1 );
        subset(str , r+str.charAt(counter) , counter+1 );
    }
    public static void main(String[] args) {
        String str = "ABC";
        Question8 a = new Question8();
        a.subset(str , "" , 0);
    }
}
