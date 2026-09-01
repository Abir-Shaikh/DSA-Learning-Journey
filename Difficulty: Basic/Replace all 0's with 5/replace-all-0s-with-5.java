class Solution {
    public int convertFive(int n) {
        // code here
        if(n == 0) return 5;
        int result = n;
        int place_value = 1;
        
        while(n > 0){
            int digit = n%10;
            if(digit == 0){
                result += place_value*5;
            }
            place_value = place_value*10;
            n=n/10;
        }
        return result;
    }
}