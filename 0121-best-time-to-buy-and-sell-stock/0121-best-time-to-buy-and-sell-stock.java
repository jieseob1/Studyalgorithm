class Solution {
    public int maxProfit(int[] prices) {
        int[] dp = new int[100001]; //dp로 풀 예정
        int minPrice = Integer.MAX_VALUE;
        for(int i = 1; i < prices.length+1; i++) {
            minPrice = Math.min(minPrice, prices[i-1]); // 최솟값을 찾고,
            dp[i] = Math.max(dp[i-1], prices[i-1] - minPrice);
        }
        return dp[prices.length];
    }
}