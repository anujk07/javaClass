class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum= (n*(n+1))/2;
        int x=0;
        for (int i =0; i<n;i++){
            x+=nums[i];
        }
        int missing = sum-x;
        return missing;
    }
}