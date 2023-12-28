import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static int n,m, v;
  public static int[][] arr;
  public static boolean[] visited;

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());//노드
    m = Integer.parseInt(st.nextToken()); // 간선
    v = Integer.parseInt(st.nextToken()); // 탐색 시장 정점 번ㄱ
    arr = new int[n+1][n+1];

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int vertexNum1 = Integer.parseInt(st.nextToken());
      int vertexNum2 = Integer.parseInt(st.nextToken());
      arr[vertexNum1][vertexNum2] = 1;
      arr[vertexNum2][vertexNum1] = 1;
    }
    visited = new boolean[n + 1];
    dfs(v);
  }

  private static void dfs(int v) {
    visited[v] = true;
    System.out.println(v + " ");

    if (v == arr.length) {
      return;
    }
    // 재귀
    for (int j = 1; j < arr.length; j++) {
      // 연결은 됐지만, 방문하지 않는 경우
      if (arr[v][j] == 1 && visited[j] == false) {
        dfs(j);
      }
    }

  }

  private static void bfs() {
    //Queue

  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}