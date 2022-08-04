 class goodPair{
    public int numIdenticalPairs(int[] nums) {
        int arr=nums.length;
                int res=0;
                for(int i=0; i<arr; i++){
                    for(int j=i+1; j<arr; j++){
                        if(nums[i]==nums[j]){
                            res++;
                        }
                    }
                }return res;
                
            }
}