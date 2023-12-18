import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  //메모이제이션이란? =>
  static int[][] dy = new int[35][35];
  static int n,m;

  public static int dfs(int n, int r) {
    if (dy[n][r] > 0) {
      return dy[n][r];
    }
    if (n == r || r == 0) return 1;
    else {
      return dy[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
    }
  }
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());


  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}