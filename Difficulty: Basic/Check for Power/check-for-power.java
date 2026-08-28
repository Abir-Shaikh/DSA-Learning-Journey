class Solution {
    public boolean isPower(int x, int y) {
        // code here
        if(x == 1){
            return (y == 1);
        }
        
        long pow = 1;
        while(pow < y){
            pow *= x;
        }
        
        return (pow == y);
    }
}