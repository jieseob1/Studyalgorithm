import java.util.*;

class Solution {
    public int coinChange(int[] coins, int amount) {
        //dp로 풀어야 될듯 => 걍 dp로 푸는게 맞을 듯 그리디로 했는데 잘 안됨
        //coins를 반대로 정렬한 뒤 
        //amount만큼의 배열을 만든 뒤, 
        
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE-1);
        Arrays.sort(coins); //[83,186,408,419], amount => 6249
        dp[0] = 0;
        for(int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if( i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i-coin] + 1);
                }
            }
        }
        for(int ele : dp) {
                System.out.print(ele+" ");
            }
        return (dp[amount] == (Integer.MAX_VALUE -1)) ? -1 : dp[amount];
    }
}