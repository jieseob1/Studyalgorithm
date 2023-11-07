import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    recursive(n);
    //재귀 함수: backTracking, stackTrace
  }

  public static void recursive(int n) {
    if (n == 1) {
      System.out.println(n+" ");
    } else {
      recursive(n - 1);
      System.out.println(n +" ");
    }

  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}