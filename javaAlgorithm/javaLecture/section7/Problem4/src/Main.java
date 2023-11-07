import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int[] arr;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    arr = new int[n+1];
    fibonacci(n);
    for (int i = 1; i <= n; i++) {
      System.out.print(arr[i]+" ");
    }
  }

  public static int fibonacci(int num) {
    if (arr[num] > 0) {//값 호출이미 했다면, 그냥 더 호출하지 말고 값 가져와라
      return arr[num];
    }
    if (num == 1) {
      return arr[num] = 1;
    } else if (num == 2) {
      return arr[num] = 1;
    } else {
      fibonacci(num-1);
      return arr[num] = fibonacci(num-1) + fibonacci(num-2); //이게 되네
    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}