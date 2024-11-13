import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int n,m, cnt; //100 이하
  static boolean[][] visitied;
  static char[][] map;
  static int white,blue;
  public static void main(String[] args) throws IOException {
    solution();
  }

  private static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    map = new char[m][];

    for (int i = 0; i < m; i++) {
      map[i] = br.readLine().toCharArray();
    }
    visitied = new boolean[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        cnt = 0;
        dfs(i,j, map[i][j]);
        if (map[i][j] == 'W') {
          white += Math.pow(cnt, 2);
        }  else {
          blue += Math.pow(cnt, 2);
        }
      }
    }
    System.out.print(white + " " + blue);
  }

  private static void dfs(int x, int y, char ch) {
    if (visitied[x][y]) return;
    visitied[x][y] = true;
    cnt++;
    int[] dx = {0,1,0,-1};
    int[] dy = {1, 0, -1, 0};
    for (int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];
      if (nx >= m || nx < 0 || ny >= n || ny < 0 || visitied[nx][ny] || ch != map[nx][ny]) continue;
      dfs(nx, ny, ch);
    }
  }
}