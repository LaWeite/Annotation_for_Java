/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> check_uniq = new HashSet<>();
        for (int element : nums) {
            if (!(check_uniq.add(element))) {
                return true;
            }
        }

        return false;
    }
}
