/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
*/

//First solution
class Solution {
  public int addDigits(int num) {
    return 1 + (num - 1) % 9;
  }
}

//Second solution
class Solution {
    public int addDigits(int num) {
        String number = Integer.toString(num);

        while (number.length() > 1) {
            int number_new = 0;
            for (int index = 0; index < number.length(); ++index) {
                number_new += Character.getNumericValue(number.charAt(index));
            }

            number = Integer.toString(number_new);
        }

        return Integer.parseInt(number);
    }
}
