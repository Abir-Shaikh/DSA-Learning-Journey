class Solution {
    static int closestNumber(int n, int m) {
        // code here
        int q = n/m;
        int n1 = q * m;
        
        int n2;
        if((n*m) > 0){
            n2 = m*(q+1);
        }else{
            n2 = m*(q-1);
        }
        int dist1 = Math.abs(n-n1);
        int dist2 = Math.abs(n-n2);
        
        if(dist1 < dist2){
            return n1;    
        }
        else{
            return n2;
        }
    }
}