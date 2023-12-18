import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int n,m;
  static int[] perm;

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    perm = new int[m];
    dfs(0);
  }

  public static void dfs(int L) {
    if (L == m) {
      for (int i = 0; i < m; i++) {
        System.out.print(perm[i]+" ");
      }
      System.out.println();
    } else {
      //level이 다 안될때

      for(int i=1; i<=n; i++){ //여기서 for문이 어케 도는지 모르겠음
        perm[L]=i;//0,1
        dfs(L+1);//1
      }

    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}