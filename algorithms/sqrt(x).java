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
        int start=1;
        int end=x;
        while(start<=end){
            
           int mid=start+(end-start)/2;
            if(mid<=x/mid){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
}
