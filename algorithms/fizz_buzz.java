/*
Given an integer n, return a string array answer (1-indexed) where:
answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
*/

//First solution
import java.util.AbstractList;
import java.util.List;

class Solution {
    public static List<String> fizzBuzz(int n) {
        return new AbstractList<String>() {
            @Override
            public String get(int index) {
                index++;
                if (index % 3 == 0 && index % 5 == 0) {
                    return "FizzBuzz";
                }
                if (index % 3 == 0) {
                    return "Fizz";
                }
                if (index % 5 == 0) {
                    return "Buzz";
                }
                return Integer.toString(index);
            }

            @Override
            public int size() {
                return n;
            }
        };
    }
}

//Second solution
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int index = 1; index < n + 1; ++index) {
            if (index % 3 != 0) {
                if (index % 5 != 0)
                    result.add(Integer.toString(index));
                else
                    result.add("Buzz");
            }
            else {
                if (index % 5 == 0)
                    result.add("FizzBuzz");
                else
                    result.add("Fizz");
            }
        }

        return result;
    }
}
