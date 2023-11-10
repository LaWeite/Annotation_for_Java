/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
*/

//First way
// Time Complexity : O(n)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Base case...
        if(nums == null || nums.length < 2 || k == 0)
            return false;
        int i = 0;
        // Create a Hash Set for storing previous of k elements...
        HashSet<Integer> hset = new HashSet<Integer>();
        // Traverse for all elements of the given array in a for loop...
        for(int j = 0; j < nums.length; j++) {
            // If duplicate element is present at distance less than equal to k, return true...
            if(!hset.add(nums[j])){
                return true;
            }
            // If size of the Hash Set becomes greater than k...
            if(hset.size() >= k+1){
                // Remove the last visited element from the set...
                hset.remove(nums[i++]);
            }
        }
        // If no duplicate element is found then return false...
        return false;
    }
}

//Second way
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int index = 0; index < nums.length; ++index) {
            if (map.containsKey(nums[index])) {
                int minDist = index - map.get(nums[index]);
                if (minDist <= target) {
                    return true;
                }

                map.remove(nums[index]);
                map.put(nums[index], index);
            }

            map.put(nums[index], index);
        }
        
        return false;
    }
}
