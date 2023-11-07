import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    System.out.println(factorial(n));
  }

  public static int factorial(int n) {
    if (n == 1) {
      return n;
    } else {
      return n * factorial(n-1);
    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}