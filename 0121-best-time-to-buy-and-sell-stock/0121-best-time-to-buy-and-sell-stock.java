class Solution {
    public int maxProfit(int[] prices) {
       int min = 10001;
       int max = 0;
       for(int i = 0; i < prices.length;i++)  {
           min = Math.min(prices[i],min); //최소가격 업데이트
           max = Math.max(max, prices[i] - min); // 최대 이윤과 가격 돌면서의 가격을 확인
       }
       return max;
    }
}