/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/

//First solution
import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;

        for(int i = 0; i < nums.length; i++) {
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ (i + 1);
        }

        return xor1 ^ xor2;
    }
}

//Second solution
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfAll = n*(n+1)/2;
        for(int i : nums){
            sumOfAll -= i;
        }

        return sumOfAll;
    }
}
