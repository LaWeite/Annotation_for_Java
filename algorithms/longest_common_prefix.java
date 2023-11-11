/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }

        String prefix = strs[0];
        for (int index = 1; index < strs.length; ++index) {
            while (strs[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
