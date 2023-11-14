import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static boolean[] isVisited;
  static int n;
  static int ch[];
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    ch = new int[n + 1];
    isVisited = new boolean[n];
    DFS(1);
  }

  public static void DFS(int L) {
    if (L == n + 1) {
      for (int i = 0; i < n; i++) {
        if (ch[i + 1] == 1) {
          System.out.print(i+1+" ");
        }
      }
      System.out.println();
    } else {
      ch[L] = 1; //true
      DFS(L + 1);
      ch[L] = 0; //false
      DFS(L + 1);
    }
  }

  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}