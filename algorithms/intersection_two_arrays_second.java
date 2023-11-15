/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
*/

import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       int[] freq = new int[1001];
        for (int index = 0; index < nums1.length; ++index) {
            ++freq[nums1[index]];
        }

        int result[] = new int[nums2.length];
        int i = 0;
        for (int index = 0; index < nums2.length; ++index) {
            if (freq[nums2[index]] != 0) {
                result[i++] = nums2[index];
                --freq[nums2[index]];
            }
        }

        result = Arrays.copyOf(result, i);

        return result; 
    }
}
