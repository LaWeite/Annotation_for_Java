/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*/

//First solution
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
       char[] chars_1 = s.toCharArray();
        Arrays.sort(chars_1);
        String sorted_1 = new String(chars_1);

        char[] chars_2 = t.toCharArray();
        Arrays.sort(chars_2);
        String sorted_2 = new String(chars_2);

        return sorted_1.equals(sorted_2); 
    }
}

//Second solution
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[256];
        for (char c: s.toCharArray()) {
            map[(int)c]++;
        }

        for (char c: t.toCharArray()) {
            map[(int)c]--;
        }
        
        for (int x: map) {
            if (x != 0) {
                return false;
            }
        }

        return true;
    }
}
