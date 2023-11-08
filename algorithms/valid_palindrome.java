/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. 
Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
*/

//First version - Faster
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        while(start<end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            else{
                if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                    return false;
                }

                ++start;
                --end;
            }
        }
        return true;
    }
}

//Second version
class Solution {
    public boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        for (int index = 0; index < str.length(); ++index) {
            if (str.charAt(index) != str.charAt(str.length() - index - 1)) {
                return false;
            }
        }

        return true;
    }
}
