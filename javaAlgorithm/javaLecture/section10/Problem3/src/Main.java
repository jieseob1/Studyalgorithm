import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int n;

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int answer = 0;
    n = Integer.parseInt(st.nextToken());
    st =new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    int[] dy = new int[n];
    dy[0] = 1;
    answer = dy[0];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    for (int i = 1; i < arr.length; i++) {
      int max = 0;
      for (int j = i - 1; j >= 0; j--) { //이전꺼 탐색
        if (arr[j] < arr[i] && dy[j] > max) {
          max = dy[j];
        }
        dy[i] = max + 1;
      }
    }
    System.out.println(answer);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}