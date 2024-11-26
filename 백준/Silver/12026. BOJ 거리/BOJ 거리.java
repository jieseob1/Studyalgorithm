import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  static int n;
  static long[] dp;
  static char[] chars;

  public static void main(String[] args) throws IOException {
    solution();

  }

  private static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    dp = new long[n + 1];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    dp[1] = 0;
    chars = new char[n + 1];
    String str = br.readLine();
    for (int i = 1; i <= n; i++) {
      chars[i] = str.charAt(i - 1);
    }

    for (int i = 1; i <= n; i++) {
      for (int j = i+1; j <= n; j++) {
        long k = j - i;
        if(k <= 0 ) continue;
        if (chars[i] == 'B' && chars[j] == 'O') { //i는 현재 위치, j는 이동할 위치
          dp[j] = Math.min(dp[j], dp[i] + k * k);
        } else if (chars[i] == 'O' && chars[j] == 'J') {
          dp[j] = Math.min(dp[j], dp[i] + k * k);
        } else if (chars[i] == 'J' && chars[j] == 'B') {
          dp[j] = Math.min(dp[j], dp[i] + k * k);
        }
      }
    }
    if (dp[n] == Integer.MAX_VALUE) {
      System.out.println(-1);
    } else {
      System.out.println(dp[n]);
    }
    
  }



}