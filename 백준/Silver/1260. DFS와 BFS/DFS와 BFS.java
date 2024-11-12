import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  static int n,m,v;
  static boolean[] visited;
  static List<Integer>[] list;
  public static void main(String[] args) throws IOException {
    solution();
  }

  private static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken()); //정점
    m = Integer.parseInt(st.nextToken()); // 간선
    v = Integer.parseInt(st.nextToken()); // 탐색 시작 정점
    list = new ArrayList[n+1];
    for (int i = 0; i < n+1; i++) {
      list[i] = new ArrayList<>();
    }
    visited = new boolean[n+1];
    for (int i = 0; i < m; i++) { // 간선 연결
      st = new StringTokenizer(br.readLine());
      int from = Integer.parseInt(st.nextToken());
      int to = Integer.parseInt(st.nextToken());
      list[from].add(to);
      list[to].add(from);
    }
    for (int i = 0; i < n + 1; i++) {
      Collections.sort(list[i]);
    }
    dfs(v);
    visited = new boolean[n+1];
    System.out.println();
    bfs(v);
  }

  private static void bfs(int v) {
    Queue<Integer> q = new LinkedList<>();
    q.offer(v);
    while (!q.isEmpty()) {
      Integer integer = q.poll();
      if (visited[integer]) continue;
      visited[integer] = true;
      System.out.print(integer +" ");
      for (Integer i : list[integer]) {
        q.offer(i);
      }
    }
  }

  private static void dfs(int start) {
    if (visited[start]) return;
    visited[start] = true;
    System.out.print(start + " ");
    for (Integer integer : list[start]) {
      dfs(integer);
    }
  }
}
