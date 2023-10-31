/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
*/

//First vaariant
class Solution {
    /// O(n) algorithm with O(1) extra space
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        for (; i >= 0 && s.charAt(i) == ' '; i--);

        int len = 0;
        for (; i >= 0 && s.charAt(i) != ' '; i--) len++;

        return len;          
    } // end-lengthOfLastWord
}

//Second variant
class Solution {
    public int lengthOfLastWord(String s) {
        int maxLen = 0;
        int len = 0;
        for (int index = 0; index < s.length(); ++index) {
            if (s.charAt(index) == ' ') {
                if (len > 0) {
                    maxLen = len;
                    len = 0;
                }
            } 
            else if (index == s.length() - 1) {
                maxLen = len + 1;
            }
            else {
                ++len;
            }
        }

        return maxLen;
    }
}
