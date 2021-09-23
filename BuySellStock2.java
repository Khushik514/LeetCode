/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
*/
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[0];
        int profit = 0;
        int curr;
        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i - 1] < prices[i])
                profit = profit + prices[i] - prices[i - 1];
        }
        return profit;
    }
}