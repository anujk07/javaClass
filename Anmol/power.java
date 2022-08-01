class Solution {
    public double myPow(double x, int n) {
        
       double ans = 1;
        long kj = n;
        if(kj<0)
            kj = -1 * kj;
         while(kj>0){
             
             if(kj%2 == 1){
                 ans = ans*x;
                 kj--;
             }
             else {
                 x = x*x;
                 kj = kj/2;
                 
             }
}
        if(n<0) 
            ans = 1/ans;
        return ans;
        
    }
}