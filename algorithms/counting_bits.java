/*
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
ans[i] is the number of 1's in the binary representation of i.
*/

class Solution {
    public int[] countBits(int n) {
        int res[] = new int[n+1];
        for(int num = 0; num <= n; ++num)
            res[num] = (bitCnt(num));
        return res;
    }
    private int bitCnt(int num){
        int cnt = 0;
        while(num > 0){
            ++cnt;
            num &= (num-1);
        }
        return cnt;
    }    
}
