import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int n,m;
  static int[] perm,num,ch;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    num = new int[n];
    ch = new int[n];
    perm = new int[m];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      num[i] = Integer.parseInt(st.nextToken());
    }
    dfs(0);
  }

  public static void dfs(int L) {
    if (L == m) {
      for (int i = 0; i < m; i++) {
        System.out.print(perm[i]+" ");
      }
      System.out.println();
    } else {
      for (int i = 0; i < n; i++) {
        if (ch[i] == 0) {
          ch[i] = 1; // 이부분이 잘 이해가 안됨!!
          perm[L] = num[i];
          dfs(L+1);
          ch[i] = 0;
        }
      }
    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}