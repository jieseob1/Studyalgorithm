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

  static int n; //지도의 크기
  static int[][] map,visited;
  static int cnt;
  static int innerCnt;

  public static void main(String[] args) throws IOException {
    solution();
  }

  private static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    map = new int[n][n];
    visited = new int[n][n];

    for (int i = 0; i < n; i++) {
      String str = br.readLine();
      for (int j = 0; j < n; j++) {
        map[i][j] = str.charAt(j) - '0';
      }
    }
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (map[i][j] == 1 && visited[i][j] == 0) {
          innerCnt = 1;
          dfs(i, j);
          list.add(innerCnt);
          cnt++;
        }
      }
    }
    Collections.sort(list);
    System.out.println(cnt);
    for (Integer i : list) {
      System.out.println(i);
    }
  }

  private static void dfs(int x, int y) {
    visited[x][y] = 1;
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    for (int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y+ dy[i];
      if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
      if (map[nx][ny] == 1 && visited[nx][ny] == 0) {
        visited[nx][ny] = 1;
        innerCnt++;
        dfs(nx, ny);
      }
    }
  }


}