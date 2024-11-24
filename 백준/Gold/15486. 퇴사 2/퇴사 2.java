import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int n;

  public static void main(String[] args) throws IOException {
    solution();
  }

  private static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    //t는 걸리는 날짜, p는 금액
    int[] t = new int[n + 1]; //time
    int[] p = new int[n + 1]; //price

    long[] dp = new long[n + 1];
    for (int i = 1; i <= n; i++) {
      st = new StringTokenizer(br.readLine());
      t[i] = Integer.parseInt(st.nextToken());
      p[i] = Integer.parseInt(st.nextToken());
    }
    for (int i = 1; i <= n; i++) { // 현재 값과 다음값을 넣는 정도로만
      dp[i] = Math.max(dp[i], dp[i - 1]);
      int nextDay = i + t[i];
      if (nextDay <= n + 1) {
        dp[nextDay - 1] = Math.max(dp[nextDay - 1], dp[i - 1] + p[i]);
      }

    }
    System.out.println(dp[n]);
//    System.out.println(dp[n+1]);
  }
}