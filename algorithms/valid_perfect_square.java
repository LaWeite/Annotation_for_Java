/*
Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.
*/

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        
        int start = 2;
        int end = num / 2;
        while (start <= end) {
            int mid = (start + end) >>> 1;
            long square = (long) mid * mid;
            if (square < num)
                start = mid + 1;
            else if (square > num)
                end = mid - 1;
            else
                return true;
        }

        return false;
    }
}
