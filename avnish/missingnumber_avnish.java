class Solution {
    public int missingNumber(int[] nums) {
       int a=0;
        int b;
        int c;
        for (int i=0;i<nums.length;i++){
            a=a+nums[i];
        }
        b=(nums.length*(nums.length+1))/2;
        c=b-a;
        return c;
    }
}