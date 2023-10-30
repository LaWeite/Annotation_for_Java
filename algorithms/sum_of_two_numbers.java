class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];

        outer:
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int k = i + 1; k < nums.length; ++k) {
                if (nums[i] + nums[k] == target) {
                    array[0] = i;
                    array[1] = k;
                    break outer;
                }
            }
        }

        return array;
    }
}
