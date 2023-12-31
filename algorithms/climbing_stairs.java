/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/

class Solution {
    public int climbStairs(int n) {
        int[] steps = new int[45];
        steps[0] = 1;
        steps[1] = 2;
        for (int i = 2; i < n; ++i) {
            steps[i] = steps[i - 2] + steps[i - 1];
        }

        return steps[n - 1];
    }
}
