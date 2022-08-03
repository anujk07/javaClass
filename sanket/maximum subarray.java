class Solution {
    public static int maxSubArray(int[] nums) {
        
        int max=0;
        int n =nums.length;
        for(int i=0;i<=n-1;i++){
            int sum =0;
            for(int j=i;j<=n-1;j++){
                sum=sum+nums[j];
                  if(sum>max){
                      max=sum;
                  }
            }
            
        }
        
       return max;
           
    }
    
   
}