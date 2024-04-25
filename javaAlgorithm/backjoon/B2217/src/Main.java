import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  //1부터 n까지 돌면서 최대 중량 확인하기
  //15 17 20
  // 15 100 30 => 45가 아니라 100임
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);
    int max = arr[n - 1];
    for (int i = 1; i <= n; i++) {
      max = Math.max(arr[n-i] * i, max);
    }
    System.out.println(max);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}