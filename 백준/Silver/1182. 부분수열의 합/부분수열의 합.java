import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  private static int cnt = 0;

  public static void main(String[] args) throws IOException {
    Main.solution();
  }

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(stringTokenizer.nextToken());
    int s = Integer.parseInt(stringTokenizer.nextToken());

    stringTokenizer = new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(stringTokenizer.nextToken());
    }
    int sum = 0;
    subSequence(arr, 0, sum, s, n);
    System.out.println((s == 0 ) ? (cnt-1) : cnt);
  }

  private static void subSequence(int[] arr, int depth, int sum, int s, int n) {
    if (depth == n ) {
      if (sum == s) {
        cnt++;
      }
      return;
    }
    //더할건지 안 더할건지만 체크
    subSequence(arr, depth + 1, sum + arr[depth], s, n);
    subSequence(arr, depth + 1, sum, s, n);

  }

}