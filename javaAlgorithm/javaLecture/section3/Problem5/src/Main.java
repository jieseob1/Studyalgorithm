import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int n;
  static int[] arr;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    int cnt = 0;
    int sum = 0;
    int lt = 0;
    int m = (n/2) +1;
    arr = new int[m];
    for (int i = 0; i < m; i++) { // m전가지만 더해주면 된다.
      arr[i] = i + 1;
    }
    for (int rt = 0; rt < m; rt++) {
      sum += arr[rt];
      if (sum == n) {
        cnt++;

      }
      while (sum >= n) {
        sum -= arr[lt++];
        if (sum == n) {
          cnt++;
        }
      }
    }
    System.out.println(cnt);

  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}