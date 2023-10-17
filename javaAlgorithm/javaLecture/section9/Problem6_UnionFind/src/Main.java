import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static int[] unf;

  public static int Find(int v) {
    if (v == unf[v]) {
      System.out.println("find if v => " + v);
      return v; // 해당 집합을 return 해주라
    } else {
      System.out.println("find else v:" + v);
      return unf[v] = Find(unf[v]); // 재귀로 돌아서 값 찾은 것을 unf[v]에다가 넣자
    }
  }

  public static void Union(int a, int b) {
    int fa = Find(a);
    int fb = Find(b);
    if (fa != fb) {
      unf[fa] = fb;
    }
      //만약 다른 집합에 있다면, 같은 집합으로 묶는다
  }

  public static void solution() throws IOException {
    String ans = "NO";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    unf = new int[n+1];
    for (int i = 1; i <= n; i++) {
      unf[i] = i;
    }
    for (int i = 1; i <= m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      Union(a, b);
    }
    st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int fa = Find(a);
    int fb = Find(b);
    if (fa == fb) {
      ans = "YES";
    }
    System.out.println(ans);

  }
  public static void main(String[] args) throws IOException {
    Main.solution();

  }
}