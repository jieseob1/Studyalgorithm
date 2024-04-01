import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int[][] map;
  static boolean[][] visited;
  static int[] dx = {1, 0, -1, 0};
  static int[] dy = {0, 1, 0, -1};
  static int T, M, N, K;

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    T = Integer.parseInt(st.nextToken());

    for (int k = 0; k < T; k++) {
      st = new StringTokenizer(br.readLine());
      M = Integer.parseInt(st.nextToken()); // 가로
      N = Integer.parseInt(st.nextToken()); // 세로
      K = Integer.parseInt(st.nextToken());

      map = new int[N][M];
      for (int i = 0; i < K; i++) {
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        map[y][x] = 1;
      }
      visited = new boolean[N][M];
      int cnt = 0;
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
          if ((!visited[i][j] && map[i][j] == 1)) {
            dfs(i, j);
            cnt++;
          }
        }
      }
      System.out.println(cnt);
    }
  }

  public static void dfs(int x, int y) {
    if (!visited[x][y] || map[x][y] == 1) {
      visited[x][y] = true;

      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (nx < N && nx >= 0 && ny >= 0 && ny < M) {
          if (!visited[nx][ny] && map[nx][ny] == 1) {
            dfs(nx, ny);
          }
        }
      }
    }
  }

  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}