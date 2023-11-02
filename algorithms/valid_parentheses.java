/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
*/

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }

            if (stack.empty()) {
                return false;
            }

            char take = (char) stack.pop();
            switch (c) {
                case ')':
                    if (take != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (take != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (take != '{') {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }

        return stack.empty();
    }
}
