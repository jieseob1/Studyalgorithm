import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
  public int x,y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
public class Main {

  static int[] dx = {-1, 0, 1, 0};
  static int[] dy = {0, 1, 0, -1};
  static int [][] board, dis; // dis는 거리 추가해주는 곳

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    board = new int[7][7];
    dis = new int[7][7];

    for (int i = 0; i < 7; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 7; j++) {
        board[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    bfs(0, 0);
    if (dis[6][6] == 0) {
      System.out.println(-1);
    } else {
      System.out.println(dis[6][6]);
    }
  }

  public static void bfs(int x, int y) {
    Queue<Point> queue = new LinkedList();

    //queue에 먼저 초기값 넣음
    //queue 없어질때까지 돌림
    // 먼저 queue에 넣은거 뺀다.
//    for문 돈다. 다음부분 가는거 해서 갈 수 있으면, 벽으로 가로 막고, queue에 다음 행선지 넣고, dis에 다음 부분 추가해주기
    queue.offer(new Point(x, y));
    board[x][y] = 1;//벽으로 가로 막기
    while (!queue.isEmpty()) {
      Point tmp = queue.poll();
      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (nx >= 0 && ny >= 0 && nx < 7 && ny < 7 && board[nx][ny] == 0) {
          board[nx][ny] = 1;
          queue.offer(new Point(nx, ny));
          dis[nx][ny] = dis[tmp.x][tmp.y] + 1; // 이전보다 +1 더 해주기
        }
      }
    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}