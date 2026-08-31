class Solution {
    public int reverseDigits(int n) {
        // Code here
        int reverse_num = 0;
        
        while(n != 0){
            int digit = n % 10;
            reverse_num = (reverse_num * 10) + digit;
            n = n/10;
        }
        return reverse_num;
    }
}