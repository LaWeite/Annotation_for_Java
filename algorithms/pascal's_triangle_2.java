/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it.
*/

//First solution - Faster
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int row) {
        List<Integer> list = new ArrayList<>();
        long start=1;
        list.add((int)start);
        for(int i=0;i<row;i++)
        {
            start*=(row-i);
            start/=(i+1);
            list.add((int)start);
        }
        return list;
    }
}

//Second solution
class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> needed_row = new LinkedList<>();
        needed_row.add(1);
        if (rowIndex == 0) {
            return needed_row;
        }

        needed_row.add(1);
        if (rowIndex == 1) {
            return needed_row;
        }

        int index = 2;
        do {
            List<Integer> result = new LinkedList<>();
            result.add(1);
            for (int ind = 1; ind < index; ++ind) {
                result.add(needed_row.get(ind - 1) + needed_row.get(ind));
            }
            result.add(1);

            needed_row = result;

            ++index;
        } while (index < rowIndex + 1);

        return needed_row;
    }
}
