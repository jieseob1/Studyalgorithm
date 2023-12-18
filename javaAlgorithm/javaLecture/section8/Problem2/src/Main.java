import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int[] arr;
  static int c,n,total = 0;

  public static void DFS(int v, int sum) {
    if (sum > c) return;
    if (v == n) { //
      total = Math.max(sum, total);
    } else {
      DFS(v+1, sum + arr[v]);
      DFS(v+1, sum);
    }
  }
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    c = Integer.parseInt(st.nextToken());
    n = Integer.parseInt(st.nextToken());

    arr = new int[n];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i] = Integer.parseInt(st.nextToken());
    }
    DFS(0,0);
    System.out.println(total);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}