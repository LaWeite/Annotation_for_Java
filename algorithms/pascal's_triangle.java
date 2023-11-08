/*
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it.
*/

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result_triang = new LinkedList<List<Integer>>();
        for (int index = 0; index < numRows; ++index) {
            List<Integer> row = new LinkedList<Integer>();
            if (index == 0) {
                row.add(1);
                result_triang.add(row);
                continue;
            }
            for (int element = 0; element < index; ++element) {
                if (element == 0) {
                    row.add(1);
                }
                

                if (element != 0) {
                    row.add(result_triang.get(index - 1).get(element - 1) + result_triang.get(index - 1).get(element));
                }

                if (element + 1 == index) {
                    row.add(1);
                }
            }

            result_triang.add(row);
        }

        return result_triang;
    }
}
