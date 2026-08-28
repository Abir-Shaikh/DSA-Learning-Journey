class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum = 0;
        while( n!= 0){
            int temp = (n%10);
            sum+= temp;
            n /= 10;
        }
        int original = sum;
        int reverse = 0;
        
        while(sum != 0){
            int digit = sum % 10;
            reverse = reverse * 10 + digit;
            sum /= 10;
        }
        return original == reverse;
    }
}