import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static long a,b,c, ans;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    a = Integer.parseInt(st.nextToken());
    b = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());
    ans = 1;

    for (int i = 0; i < b; i++) {
      if (a > c) {
        ans *= (a % c);
      } else {
        ans = (a % ㅊ * ans) % c;
      }
    }
    System.out.println(ans);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}