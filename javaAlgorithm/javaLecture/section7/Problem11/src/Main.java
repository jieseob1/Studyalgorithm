import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
//  무방향 그래프, 방향 그래프

  static int[][] graph;
  static int cnt = 0;
  static int[] ch;
  static int n,m;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken()); // 정점
    m = Integer.parseInt(st.nextToken()); // 간선
    graph = new int[n+1][n+1];
    ch = new int[n + 1];
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      graph[a][b] = 1;
    }

    ch[1] =1;
    System.out.println(DFS(1));
  }

  public static int DFS(int v) {
    if (v == n) {
      cnt++;
    } else {
      for (int i = 1; i < n+1; i++) { //정점만큼 돌면서 있는거 찾을거
        if (graph[v][i] == 1) { //접근이 가능하다면 & 방문 안했다면
          if (ch[i] == 0) { // 해당 부분 방문 시키면 다시 못가게 막아야 하니까
            ch[i] = 1;
            DFS(i);
            ch[i] = 0;
          }
        }
      }
    }
    return cnt;
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}