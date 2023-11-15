/*
Given a string s, find the first non-repeating character in it and return its index.
If it does not exist, return -1.
*/

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        for (int index = 0; index < s.length(); ++index) {
            ++freq[s.charAt(index) - 97];
        }

        int result = -1;
        for (int index = 0; index < freq.length; ++index) {
            if (freq[index] == 1) {
                if (result == -1) {
                    result = s.indexOf((char) index + 97);
                }
                
                if (result > s.indexOf((char) index + 97)) {
                    result = s.indexOf((char) index+ 97);
                }
            }
        }
        
        return result;
    }
}
