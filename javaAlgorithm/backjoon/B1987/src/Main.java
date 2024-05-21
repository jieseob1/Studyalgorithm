import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
  static int R, C;
  static int[] dx = {1, 0, -1, 0};
  static int[] dy = {0, 1, 0, -1};
  static int cnt = 1;

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    R = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());

    char[][] arr = new char[R][C];
    for (int i = 0; i < R; i++) {
      String str = br.readLine();
      for (int j = 0; j < C; j++) {
        arr[i][j] = str.charAt(j);
      }
    }
    boolean[] isVisited = new boolean[26];
    bfs(arr, isVisited);
    System.out.println(cnt);
  }

  private static void dfs(char[][] arr, boolean[] isVisited) {

  }
  private static void bfs(char[][] arr, boolean[] isVisited) { //dfs로 했어야함
    Deque<int[]> deque = new ArrayDeque<>();
    char start = arr[0][0];
    deque.add(new int[] {0, 0}); // 좌표 넣어줌
    isVisited[start - 65] = true;

    while (!deque.isEmpty()) {
      int[] node = deque.poll();
      for (int i = 0; i < 4; i++) {
        int nx = node[0] + dx[i];
        int ny = node[1] + dy[i];
        if (nx >= R || nx < 0 || ny >= C || ny < 0 || isVisited[arr[nx][ny] - 65]) {
          continue;
        }
        System.out.println("next arr => " + arr[nx][ny]);
        deque.add(new int[] {nx, ny});
        isVisited[arr[nx][ny] - 65] = true;
        cnt++;
      }
    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}