class Solution {
    int factorial(int n) {
        int result = 1;
        // code here
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
