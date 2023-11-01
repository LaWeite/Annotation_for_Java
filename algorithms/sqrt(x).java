/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
*/

//First variant
class Solution {
    public int mySqrt(int x) {
        for (int index = 0;;++index) {
            long temp_1 = index * index;
            long a = index + 1;
            long temp_2 = a * a;
            if (temp_1 == x | temp_2 > x) {
                return index;
            }
        }
    }
}

//Second variant
class Solution {
    public int mySqrt(int x) {
        return findNumberOfSqrt(x);
    }
    public static int findNumberOfSqrt(int number){
        int start = 0;
        int end = number;
        long mid = start + (end - start)/2;
        int ans = -1;
        while (start <= end) {
            long sqrt = mid * mid;
            if (number == sqrt) {
                return (int)mid;
            } else if(sqrt < number){
                ans = (int)mid;
                start = (int)mid + 1;
            } else {
                end = (int)mid-1;
            }
            mid = start + (end - start)/2;
        }
        return ans;
    } 
}
