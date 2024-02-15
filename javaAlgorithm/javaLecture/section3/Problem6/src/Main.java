import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int n, k;
  static int[] arr;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int ans = 0;
    int cnt = 0; // k를 넘으면 안된다.
    int lt = 0 ;

    for (int rt = 0; rt < n; rt++) {
      if (arr[rt] == 0) {
        cnt++;
      }
      while (cnt > k) {
        if (arr[lt] == 0) {
          cnt--;
        }
        lt++;
      }
      ans = Math.max(ans, (rt - lt + 1));
    }
    System.out.println(ans);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}