import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int n;
  static int[][] board;
  static long[][] dp;

  public static void main(String[] args) throws IOException {
    solution();
  }

  private static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    board = new int[n][n];
    dp = new long[n][n];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for( int j = 0; j<n; j++){
        board[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    dp[0][0] = 1; //갈수 있는 건 1가지 범위
    // 경계 범위
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int value = board[i][j];
        if (value == 0) break;
        if (i + value < n) {
          dp[i + value][j] += dp[i][j];
        }
        if (j + value < n) {
          dp[i][j + value] += dp[i][j];
        }
      }
    }
    System.out.println(dp[n - 1][n - 1]);
  }
}