class palindrome {
    
    public boolean isPalindrome(int x) {
        
        int temp=x;
        int sum=0;
        while(x>0){
            int res=x%10;
            x=x/10;
            sum=sum*10+res;

        }
        if(temp==sum){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}