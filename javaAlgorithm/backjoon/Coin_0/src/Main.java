import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  static int n, k,cnt;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    List<Integer> arr = new ArrayList<>();
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int tmp = Integer.parseInt(st.nextToken());
      if ((k / tmp) > 0) {
        arr.add(tmp);
      }
    }
    Collections.sort(arr, Collections.reverseOrder());
    for (Integer integer : arr) {
      if (k / integer > 0) {
        cnt += (k /integer);
        k = (k % integer);
      }
    }
    System.out.println(cnt);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}