/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/

class Solution {
    public int maxProfit(int[] prices) {
        int minimum = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int index = 0; index < prices.length; ++index) {
            if (prices[index] < minimum) {
               minimum = prices[index];
            }
            else if (max_profit < prices[index] - minimum) {
                max_profit = prices[index] - minimum;
            }
        }

        return max_profit;
    }
}
