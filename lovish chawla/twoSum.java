class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr = nums.length;
        for (int i = 0; i < arr; i++) {

            for (int j = i + 1; j < arr; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };

                }
            }
        }

        return null;
    }
}
