/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
*/

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int leftRunningProduct = 1;
        for (int i = 0; i < n; i++) {
            output[i] = leftRunningProduct;
            leftRunningProduct *= nums[i];
        }
        int rightRunningProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightRunningProduct;
            rightRunningProduct *= nums[i];
        }
        return output;
    }
}
