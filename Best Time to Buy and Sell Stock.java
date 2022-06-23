class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int len = prices.length;
        int iBuy = 0; // index when buying
        for(int i=0;i<len;i++){
            if(prices[iBuy] > prices[i]) iBuy = i;
            profit = Math.max(profit, prices[i] - prices[iBuy]);
        }
        return profit;
    }
}