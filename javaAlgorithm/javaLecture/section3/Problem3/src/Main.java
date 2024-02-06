import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  //  최대 매출
  //Sliding window
  static int n,k, max;
  static int[] arr, window;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    window = new int[k];
    int sum = 0;
    for (int i = 0; i < k; i++) {
      sum += arr[i];
    }
    for (int i = k; i < n; i++) {
      sum = sum + arr[i] - arr[i - k];
      max = Math.max(sum, max);
    }
    System.out.println(max);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}