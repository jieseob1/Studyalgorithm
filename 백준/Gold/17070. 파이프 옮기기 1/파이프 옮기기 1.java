import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int N, cnt;
  static int[][] house;

  public static void main(String[] args) throws IOException {
    solution();
  }

  private static void solution() throws IOException {
    //1 x 2, 2 x 1, 2 x 2 형태
    // 파이프는 항상 빈 칸만 차지해야 한다.
    // 파이프를 n,n으로 이동시키는 방법
    // dfs로 풀 수 있을 듯
    // 빈칸은 0, 벽은 1
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    house = new int[N][N];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        house[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    //dfs를 써서 해결한다. x,y축과 그에 해당하는 direction을 넣어서 해결 => direction은 가로,  세로, 대각선이고 0,1,2로 해결한다.
    dfs(0, 1, 0);
    System.out.println(cnt);
  }

  private static void dfs(int x, int y, int direction) {
    if (x == N - 1 && y == N - 1) {
      cnt++;
    }
    //가로 => 가로, 대각선
    // 세로 => 세로, 대각선
    //대각선 => 가로,세로, 대각선
    //경계 설정 확실히
    switch (direction) {
      case 0:
        if (y + 1 < N && house[x][y + 1] == 0) {
          dfs(x, y + 1, 0);
        }
        break;
      case 1:
        if (x + 1 < N && house[x + 1][y] == 0) {
          dfs(x + 1, y, 1);
        }
        break;

      case 2:
        if (y + 1 < N && house[x][y + 1] == 0) {
          dfs(x, y + 1, 0);
        }
        if (x + 1 < N && house[x + 1][y] == 0) {
          dfs(x + 1, y, 1);
        }
        break;

    }
    if (x + 1 < N && y + 1 < N && house[x + 1][y] == 0 && house[x][y + 1] == 0
        && house[x + 1][y + 1] == 0) {
      dfs(x + 1, y + 1, 2);
    }
  }
}