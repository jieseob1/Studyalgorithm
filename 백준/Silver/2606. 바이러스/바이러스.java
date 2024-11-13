import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  static int computerNum, network, cnt;
  static boolean[] visited;
  static List<Integer>[] list;
  public static void main(String[] args) throws IOException {
    solution();
  }

  private static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    computerNum = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    network = Integer.parseInt(st.nextToken());

    list = new ArrayList[computerNum + 1];
    for (int i = 0; i < computerNum + 1; i++) {
      list[i] = new ArrayList<>();
    }
    for (int i = 0; i < network; i++) {
      st = new StringTokenizer(br.readLine());
      int from = Integer.parseInt(st.nextToken());
      int to = Integer.parseInt(st.nextToken());
      list[from].add(to);
      list[to].add(from);
    }
    visited = new boolean[computerNum + 1];
    dfs(1);
    System.out.println(cnt-1);
  }

  private static void dfs(int start) {
    visited[start] = true;
    cnt++;
    for (Integer integer : list[start]) { // 시작 하는 부분 돌면서
      if (!visited[integer]) {
        dfs(integer);
      }
    }
  }
}