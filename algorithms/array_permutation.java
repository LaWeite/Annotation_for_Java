class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int index = 0; index < nums.length; ++index) {
            ans[index] = nums[nums[index]];
        }

        return ans;
    }
}
