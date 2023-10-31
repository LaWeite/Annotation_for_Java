import java.util.StringJoiner;

class Solution {
    public static String sortSentence(String s) {
        String[] array = new String[s.length() * 2];

        StringBuilder str = new StringBuilder();
        for (int index = 0; index < s.length(); ++index) {
            if (s.charAt(index) == ' ') {
                continue;
            }

            int temp = Character.getNumericValue(s.charAt(index));
            if (0 < temp && temp <= 9) {
                array[temp - 1] = str.toString();
                str.delete(0, str.length());
                continue;
            }
            str.append(s.charAt(index));
        }

        StringJoiner joiner = new StringJoiner(" ");
        for (String string : array) {
            if (string == null) {
                break;
            }

            joiner.add(string);
        }

        return joiner.toString();
    }
}
