/*
Given a string s, find the first non-repeating character in it and return its index.
If it does not exist, return -1.
*/

//First solution
import java.util.Arrays;

class Solution {
    public int firstUniqChar(String s) {
       int[] freq = new int[26];
       for (int i = 0 ; i < s.length() ; i++) {
           freq[s.charAt(i) - 'a']++;
       }
       for (int i = 0 ; i < s.length() ; i++) {
           if (freq[s.charAt(i) - 'a'] == 1) {
               return i;
           }
       }

       return -1;
    }
}

//Second solution
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[155];

        for (int index = 0; index < s.length(); ++index) {
            ++freq[s.charAt(index)];
        }

        int result = -1;
        for (int index = 0; index < freq.length; ++index) {
            if (freq[index] == 1) {
                if (result == -1) {
                    result = s.indexOf((char) index);
                }
                
                if (result > s.indexOf((char) index)) {
                    result = s.indexOf((char) index);
                }
            }
        }
        
        return result;
    }
}
