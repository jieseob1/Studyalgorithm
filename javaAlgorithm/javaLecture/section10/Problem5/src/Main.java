import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  static int n,targetCoin;
  static int[] dy, coin;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    coin = new int[n];
    for (int i = 0; i < n; i++) {
      coin[i] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    targetCoin = Integer.parseInt(st.nextToken());

    dy = new int[targetCoin + 1];
    Arrays.fill(dy, Integer.MAX_VALUE);
    dy[0] = 0;

    for (int i = 0; i < n; i++) {
      for (int j = coin[i]; j <= targetCoin; j++) {
        dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
      }
    }
    System.out.println(dy[targetCoin]);

  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}