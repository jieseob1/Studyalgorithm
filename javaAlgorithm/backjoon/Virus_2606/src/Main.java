import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

  static int computer_num,edge;
  static boolean[] visited;

  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    computer_num = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    edge = Integer.parseInt(st.nextToken());

    visited = new boolean[computer_num + 1];
    for (int i = 0; i <= computer_num; i++) {
      graph.add(new ArrayList<>());
    }
    for (int i = 1; i <= edge; i++) {
      st = new StringTokenizer(br.readLine());
      int startNode = Integer.parseInt(st.nextToken());
      int endNode = Integer.parseInt(st.nextToken());

      graph.get(startNode).add(endNode);
      graph.get(endNode).add(startNode);
    }

    dfs(1);
    int cnt = 0;
    for (int i = 2; i <= computer_num; i++) {
      if (visited[i]) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }

  public static void dfs(int startNode) {
    if (visited[startNode]) return;
    visited[startNode] = true;
    for (Integer integers : graph.get(startNode)) {
        dfs(integers);
    }

  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}