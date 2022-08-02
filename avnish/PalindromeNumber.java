class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int a;
        int b=0;
        while(x>0){
            a=x%10;
            x /=10;
            
            b = b*10 + a;
        }
        if(n==b){
            return true;
        }
        else{
            return false;
        }
        
    }
}