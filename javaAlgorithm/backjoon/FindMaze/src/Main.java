import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point{
  int x,y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class Main {
  static int n,m;
  static int[][] map;
  static int[] dx  = {1,0,-1,0}; // 동남서북
  static int[] dy  = {0,-1,0,1};
  static int[][] visited;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    map = new int[n][m];
    visited = new int[n][m];

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      String tmp = st.nextToken();
      for (int j = 0; j < m; j++) {
        char[] ch = tmp.toCharArray();
        map[i][j] = Integer.parseInt(String.valueOf(ch[j]));
      }
    }
    visited[0][0] = 1;
    bfs(0, 0);
    System.out.println(map[n-1][m-1]);
  }

  public static void bfs(int x, int y) {
    Queue<Point> q = new LinkedList<>(); //queue
    q.offer(new Point(x, y)); // 먼저 시작점 넣기
    while (!q.isEmpty()) {
      Point point = q.poll(); // 뽑아내서
      for (int i = 0; i < 4; i++) {
        int nx = point.x + dx[i];
        int ny = point.y + dy[i];
        if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
          if (map[nx][ny] == 1 && visited[nx][ny] == 0) {
            visited[nx][ny] = 1; //방문표시하기
            q.offer(new Point(nx, ny));
            map[nx][ny] = map[point.x][point.y] + 1;
          }
        }
      }
    }


  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}