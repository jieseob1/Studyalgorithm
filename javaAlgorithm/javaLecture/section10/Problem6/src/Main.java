import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int n,m;
  static int[] dy;

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    dy = new int[m + 1];
    dy[0] = 0;
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int ps = Integer.parseInt(st.nextToken());
      int pt = Integer.parseInt(st.nextToken());
      for (int j = m; j >= pt; j--) {
        dy[j] = Math.max(dy[j], dy[j - pt] + ps);
      }
    }
    System.out.println(dy[m]);
  }
  public static void main(String[] args) throws IOException {
    //개수가 정해진 경우에는 뒤에서, 개수가 무한이면 앞에서
    Main.solution();
  }
}