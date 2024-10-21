import java.util.*;
class Solution {
    public int solution(int[][] triangle) {
        //거쳐간 숫자의 합이 가장 큰 경우
        //대각선 방향으로 한칸 오른쪽 또는 왼쪽으로만
        //1. triangle의 길이만큼 배열을 만들고, -1로 채운다.
        // 2. 갈수 있는 건 바로 아래 컬럼과, +1,+1의 경우
        //3. 먼저 아래 컬럼들을 돌면서 모두 다 더해줌 
        int n = triangle.length;
        int[][] dp = new int[n][n];
        for(int[] s: dp) {
            Arrays.fill(s, -1);
        }
        return max(0,0,dp,triangle);
    }
    private int max(int x, int y, int[][] dp, int[][] triangle) {
        //여기서 triangle돌면서 dp 
        if (x >= triangle.length || y > x) {
            return 0;
        }
        
        if(dp[x][y] != -1) return dp[x][y]; // 만약 값이 존재한다면 그냥 뺌
        
        return dp[x][y] = triangle[x][y] + Math.max(max(x+1,y,dp,triangle),max(x+1,y+1,dp,triangle));
    }
}