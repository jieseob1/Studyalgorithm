import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int sum = Integer.MAX_VALUE;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(),"-");
    System.out.println("subTraction: "+ st);
//    String[] subtraction = br.readLine().split("-");
    while (st.hasMoreTokens()) {
      int temp = 0;

      // 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
      StringTokenizer addition = new StringTokenizer(st.nextToken(), "+");

      // 덧셈으로 나뉜 토큰들을 모두 더한다.
      while (addition.hasMoreTokens()) {
        int tmp = Integer.parseInt(addition.nextToken());
        System.out.println("addition:"+tmp);
        temp += tmp;
      }
// 첫 번째토큰인 경우 temp값이 첫 번째 수가 됨
      if (sum == Integer.MAX_VALUE) {
        sum = temp;
      } else {
        sum -= temp;
      }
      System.out.println(sum);
    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}