import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int N;
  static int maxCandy = Integer.MIN_VALUE;
  static char[][] candyBoard;
  public static void main(String[] args) throws IOException {
    solution();
  }

  private static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    candyBoard = new char[N][N];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      String s = st.nextToken();
      for (int j = 0; j < N; j++) {
        candyBoard[i][j] = s.charAt(j);
      }
    }

    //row 변경
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N - 1; j++) {
        swap(i, j, i, j + 1);
        checkColumnMax();
        checkRowMax();
        swap(i, j, i, j + 1);
      }
    }
    // column 변경
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N - 1; j++) {
        swap(j, i, j + 1, i);
        checkColumnMax();
        checkRowMax();
        swap(j, i, j + 1, i);
      }
    }

    System.out.println(maxCandy);
  }

  private static void swap(int r1, int c1, int r2, int c2) {
    char temp = candyBoard[r1][c1];
    candyBoard[r1][c1] = candyBoard[r2][c2];
    candyBoard[r2][c2] = temp;
  }

  private static void checkRowMax() {
    for (int i = 0; i < N; i++) {
      int maxRowCandy = 1;
      for (int j = 0; j < N - 1; j++) {
        if (candyBoard[i][j] == candyBoard[i][j+1]) {
          maxRowCandy++;
          maxCandy = Math.max(maxRowCandy, maxCandy);
        } else {
          maxRowCandy = 1;
        }
      }
    }
  }

  private static void checkColumnMax() {
    for (int i = 0; i < N; i++) {
      int maxColumnCandy = 1;
      for (int j = 0; j < N - 1; j++) {
        if (candyBoard[j][i] == candyBoard[j+1][i]) {
          maxColumnCandy++;
          maxCandy = Math.max(maxColumnCandy, maxCandy);
        } else {
          maxColumnCandy = 1;
        }
      }
    }
  }
}