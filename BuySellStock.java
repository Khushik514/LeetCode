/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        int curr;
        for(int i = 1; i < prices.length; i++)
        {
            curr = prices[i];
            if(min > curr)
                min = curr;
            else
                profit = Math.max(profit, curr - min);
        }
        return profit;
    }
}