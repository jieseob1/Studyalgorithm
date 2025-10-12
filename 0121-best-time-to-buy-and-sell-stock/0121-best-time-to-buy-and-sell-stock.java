class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[] minProfit= new int[len];
        int[] maxProfit= new int[len];
        
        minProfit[0] = prices[0];
        for(int i = 1 ; i < len ; i++) {
            minProfit[i] = Math.min(prices[i], minProfit[i-1]);
        } // 최소값에 대한 정보를 넣어놓는다.

        for(int i = 1 ; i < len ; i++) {
            maxProfit[i] = Math.max(prices[i] - minProfit[i], maxProfit[i-1]);
        }

        return maxProfit[len-1];
    }
}