/*
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).
Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:
"a->b" if a != b
"a" if a == b
*/

//First solution - Faster
class Solution {
    public List<String> summaryRanges(int[] arr) {
        List<String> result = new ArrayList<>();
        
        for(int i =0;i<arr.length;i++){
            int start = arr[i];
            while(i<arr.length-1 && arr[i]+1 == arr[i+1]){
                i++;
            }
            if(start == arr[i]){
                result.add(""+arr[i]);
            }else{
                result.add(start+"->"+ arr[i]);
            }
            }
           
         return result;
    }
}

//Second Solution
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> range = new LinkedList<>();

        if (nums.length == 1) {
            range.add(Integer.toString(nums[0]));
            return range;
        }

        int start = 0;
        for (int end = 1; end < nums.length; ++end) {
            //модуль, тк числа могут быть отрицательными
            if (Math.abs(nums[end] - nums[end - 1]) > 1) {
                if (nums[start] == nums[end - 1]) {
                    range.add(Integer.toString(nums[end - 1]));
                }
                else {
                    range.add(nums[start] + "->" + (nums[end - 1]));
                }
                
                start = end;
            }

            if (end + 1 == nums.length) {
                if (start - end != 0) {
                    range.add(nums[start] + "->" + (nums[end]));
                }
                else {
                    range.add(Integer.toString(nums[end]));
                }
            }
        }

        return range;
    }
}
