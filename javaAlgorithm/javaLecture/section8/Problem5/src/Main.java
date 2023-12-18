import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int n,m;
  static int cnt = Integer.MAX_VALUE;
  static int[] coin;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken()); // 동전 종류 개수
    coin = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      coin[i] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    m = Integer.parseInt(st.nextToken()); //거슬러줄 금액
    dfs(0,0);
    System.out.println(cnt);
  }

  public static void dfs(int L, int sum) {
    if (sum > m) {
      return; // 이부분 중요
    }
    if (m == sum) { // 같아지게 된다면,
      cnt = Math.min(L, cnt);
    } else {
      for (int i = 0; i < n; i++) {
        dfs(L + 1, sum + coin[i]);
      }
    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}