import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  private static int N;
  private static int max = Integer.MIN_VALUE;
  private static int min = Integer.MAX_VALUE;
  public static void main(String[] args) throws IOException {
    solution();
  }

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken()); // 숫자
    }
    st = new StringTokenizer(br.readLine());
    int[] operator = new int[4];
    for (int i = 0; i < 4; i++) {
      operator[i] = Integer.parseInt(st.nextToken()); // + - * /
    }

    int result = arr[0];
    dfs(0,  arr, operator,result);
    System.out.println( max);
    System.out.println(min);
  }

  // depth 필요할거고, int result 필요 할거고, int[] operator 필요할거
  private static void dfs(int depth, int[] arr, int[] operator, int result) {
    if (depth == N - 1) {
      max = Math.max(max, result);
      min = Math.min(min, result);
    } else { // switch문으로 바꿀수 있지 않을까
      if (operator[0] != 0) {
        operator[0]--;
        result += arr[depth + 1];
        dfs(depth + 1, arr, operator,result);
        operator[0]++;
        result -= arr[depth + 1];
      }  if (operator[1] != 0) {
        operator[1]--;
        result -= arr[depth + 1];
        dfs(depth + 1,  arr, operator,result);
        operator[1]++;
        result += arr[depth + 1];
      }  if (operator[2] != 0) {
        operator[2]--;
        result *= arr[depth + 1];
        dfs(depth + 1,  arr, operator,result);
        operator[2]++;
        result /= arr[depth + 1];
      }  if (operator[3] != 0) {
        operator[3]--;
        result /= arr[depth + 1];
        dfs(depth + 1,  arr, operator,result);
        operator[3]++;
        result *= arr[depth + 1];
      }
    }
  }
}