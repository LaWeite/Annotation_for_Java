/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.
*/

//First solution
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> checkT = new HashSet<>();
        for (int index = 0; index < s.length(); ++index) {
            if (map.containsKey(s.charAt(index))) {
                if (map.get(s.charAt(index)) != t.charAt(index)) {
                    return false;
                }

                continue;
            }

            if (checkT.contains(t.charAt(index))) {
                return false;
            }
            
            checkT.add(t.charAt(index));
            map.put(s.charAt(index), t.charAt(index));
        }

        return true;
    }
}

//Second solution - Faster
class Solution {
    public boolean isIsomorphic(String s, String t) {

        int map1[]=new int[200];
        int map2[]=new int[200];

        if(s.length()!=t.length())
            return false;


        for(int i=0;i<s.length();i++)
        {
            if(map1[s.charAt(i)]!=map2[t.charAt(i)])
                return false;

            map1[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;
        }
        return true;
    }
}
