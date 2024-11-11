import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  static int n, k;
  public static void main(String[] args) throws IOException {
    solution();
  }

  private static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());

    int[] coins = new int[n];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      coins[i] = Integer.parseInt(st.nextToken());
    }
    int[] dp = new int[k + 1];
    Arrays.fill(dp, Integer.MAX_VALUE -1);
    dp[0] = 0;
    for (int coin : coins) {
      for (int i = coin; i <= k; i++) {
        dp[i] = Math.min(dp[i], dp[i - coin] + 1);
      }
    }
    if(dp[k]==Integer.MAX_VALUE-1)
      System.out.println(-1);
    else
      System.out.println(dp[k]);

  }
}