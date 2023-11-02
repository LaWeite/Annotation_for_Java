/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = 0;
        for (int index = 0; index < nums.length; ++index) {
            if (nums[index] != 0) {
                nums[nonZero++] = nums[index];
            }
        }

        for (;nonZero < nums.length; ++nonZero) {
            nums[nonZero] = 0;
        }
    }
}
