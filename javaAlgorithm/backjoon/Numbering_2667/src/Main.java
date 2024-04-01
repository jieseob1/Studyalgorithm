import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
  static int n;
  static int cnt = 0;
  static int[] dx = {1, 0, -1, 0};
  static int[] dy = {0, 1, 0, -1};
  static boolean[][] visited;
  static int[][] map;

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    map = new int[n][n];
    visited = new boolean[n][n];
    for (int i = 0; i < n; i++) {
      char[] ch = br.readLine().toCharArray();
      for (int j = 0; j < n; j++) {
        map[i][j] = (ch[j] - 48);
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (!visited[i][j] && map[i][j] == 1) {
          dfs(i, j);
          cnt++;
        }
      }
    }
    System.out.println(cnt);
    int[] list = new int[cnt];
    for (int k = 1; k <= list.length; k++) {
      int num = 1;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (map[i][j] == k) {
            list[k - 1] = num++;
          }
        }
      }
    }
    Arrays.sort(list);
    for (int i : list) {
      System.out.println(i);
    }
  }

  public static void dfs(int x, int y) {
    if (visited[x][y] || map[x][y] == 0) {
      return;
    }
    visited[x][y] = true;
    map[x][y] = cnt + 1;
    for (int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];
      if (nx < n && nx >= 0 && ny < n && ny >= 0) {
        if (!visited[nx][ny] && map[nx][ny] == 1) {
          dfs(nx, ny);
        }
      }
    }

  }

  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}