class Solution {
    public static int strStr(String haystack, String needle) {
        for (int index = 0; index < haystack.length(); ++index) {
            if (haystack.charAt(index) == needle.charAt(0)) {
                int temp = index;
                ++index;
                boolean flag = true;
                int m = 1;
                for (; m < needle.length() && index < haystack.length(); ++index, ++m) {
                    if (haystack.charAt(index) != needle.charAt(m)) {
                        index = temp;
                        flag = false;
                        break;
                    }
                }

                if (flag && m == needle.length()) {
                    return temp;
                }
            }
        }

        return -1;
    }
}
