/*
Given an integer x, return true if x is a palindrome, and false otherwise.
*/

//First version Faster
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reversed = 0;
        int temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
}

//Second Version
class Solution {
    public boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        for (int index = 0; index < number.length(); ++index) {
            if (number.charAt(index) != number.charAt(number.length() - index - 1)) {
                return false;
            }
        }

        return true;
    }
}
