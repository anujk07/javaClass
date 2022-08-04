class Solution {
    public int singleNumber(int[] nums) {
        int  R=0;
        for(int i=0;i<nums.length;i++){
            R ^= nums[i];
        }
        return R;
    }
}