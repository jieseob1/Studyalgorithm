import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
  static int n;
  static int m;
  static int[] dx = {1, 0, -1, 0};
  static int[] dy = {0, 1, 0, -1};
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    int[][] arr = new int[n][m];

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

  }

  public static void makeWall(int L,int[][] arr) {
    // 여기서 재귀로 3개의 지역을 변경할것임
    if (L == 3) {
      //여기서 bfs를 통해 돌면서 바이러스 퍼트린다. 이후 바이러스 퍼트리고 나서, 0의 갯수 구할거임
      int[][] cloneArr = cloneArr(arr);
      bfs(cloneArr);
    } else {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) { // 이렇게 할때 모든 부분들이 적당히 되는지를 모르겠음
          if (arr[i][j] == 0) arr[i][j] = 1;
          makeWall(L+1, arr);
          arr[i][j] = 0;
        }
      }
    }
  }

  public static void bfs(int[][] arr) {
    Deque<int[]> deque = new ArrayDeque<>(); // 바이러스 지점들을 한번에 넣는다.
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr[i][j] == 2) {
          deque.add(new int[] {i, j}); // 바이러스에 해당 하는 정보들 넣는다.
        }
      }
    }
    while (!deque.isEmpty()) {
      int[] pos = deque.poll();
      for (int i = 0; i < 4; i++) {
        int nx = pos[0] + dx[i];
        int ny = pos[1] + dy[1];

        if (nx < 0 || nx >= n || ny < 0 || ny >= m || arr[nx][ny] == 1) return;

        if (arr[nx][ny] == 0) {
          arr[nx][ny] = 2; //바이러스 퍼트리기
          deque.add(new int[] {nx, ny});
        }
      }
    }
  }

  public static int[][] cloneArr(int[][] arr) {
    int[][] clonedArr = arr;
    return clonedArr;
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}