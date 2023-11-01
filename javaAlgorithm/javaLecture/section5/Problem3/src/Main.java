import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static int[][] arr;
  public static int[] arr2;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < n; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    st = new StringTokenizer(br.readLine());
    int m = Integer.parseInt(st.nextToken());
    arr2 = new int[m];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) {
      arr2 = Integer.parseInt(st.nextToken());
    }



  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}