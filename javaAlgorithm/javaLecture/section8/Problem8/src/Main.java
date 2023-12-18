import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  //순열 코드를 돌리자 => 다시 풀 문제

  static int[] b, perm, ch;
  static int n, f;
  static boolean flag = false;
  static int[][] dy = new int[35][35];
  public static int combi(int n, int r) { // 조합 관련  => 메모이제이션
    if (dy[n][r] > 0) {
      return dy[n][r];
    }
    if (n == r || n == 0) {
      return 1;
    } else {
      return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }
  }

  public static  void DFS(int L, int sum) {
    if (flag) return;
    if (L == n) {
      if (sum == f) {
        for (int i : perm) {
          System.out.print(i+" ");
        }
        flag = true;
      }
    } else {
      //make permutation
      for (int i = 1; i <= n; i++) {
        if (ch[i] == 0) {
          ch[i] = 1;
          perm[L] = i;
          DFS(L+1, sum + perm[L] * b[L]);
          ch[i] = 0;
        }
      }
    }
  }
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    f = Integer.parseInt(st.nextToken());
    b = new int[n];
    perm = new int[n];
    ch = new int[n + 1]; //check array from 1
    for (int i = 0; i < n; i++) {
      b[i] = combi(n - 1, i); //put combination array
    }
    DFS(0,0);

  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}