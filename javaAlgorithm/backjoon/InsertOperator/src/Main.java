import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

  public static int[] arr;
  public static int n;
  static int[] operator = new int[4];// 0 +~~, 3 /
  static int max = Integer.MAX_VALUE;
  static int min = Integer.MIN_VALUE;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    arr = new int[n];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 4; i++) {
      operator[i] = Integer.parseInt(st.nextToken());
    }

    backTracking(1, arr[0]);
    System.out.println(max);
    System.out.println(min);
//

  }

  //
  public static void backTracking(int depth, int value) {
    if (depth == n) {
      max = Math.max(max, value);
      min = Math.min(min, value);
      return;
    } else {
      for (int i = 0; i < 4; i++) {
        if (operator[i] > 0) { // operator갯수가 남아 있다면
          operator[i]--; //연산자를 사용할 것이므로, 1을 빼줌
        }
        switch (i) {
          case 0:
            backTracking(depth + 1, value +arr[depth]);
            break;
          case 1:
            backTracking(depth + 1, value - arr[depth]);
            break;
          case 2:
            backTracking(depth +1,value *arr[depth]);
            break;
          case 3:
            backTracking(depth +1,value /arr[depth]);
            break;
        }
        operator[i]++; //사용한 연산자를 다음 dfs에서 사용할 수 있도록 다시 돌려준다.
      }
    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}