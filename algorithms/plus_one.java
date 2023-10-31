/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
*/

class Solution {
    public int[] plusOne(int[] digits) {
        for (int index = digits.length - 1; index >= 0; --index) {
            if (digits[index] < 9) {
                ++digits[index];
                return digits;
            }

            digits[index] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }
}
