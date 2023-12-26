import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static long[] memo;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    memo = new long[n+1];
    System.out.println(fibonacci(n));
  }

  public static long fibonacci(int n) {
    if (memo[n] > 0) {
      return memo[n];
    }
    if (n == 1) {
      return 1;
    }
    if (n == 0) {
      return 0;
    }
    return memo[n] = fibonacci(n-1) + fibonacci(n-2);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}