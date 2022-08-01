class Solution {

    public int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ (i + 1);

        }
        for (int j = 0; j < nums.length; j++) {
            res = res ^ nums[j];

        }
        return res;
    }

}
