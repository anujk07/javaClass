class Solution {
    public int numIdenticalPairs(int[] nums) {
        int array[]= new int[100];
        int total=0;
        for (int i:nums){
            total+=nums[i];
        }
        return total;
    }
}