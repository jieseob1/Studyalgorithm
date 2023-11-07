import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static StringBuilder sb = new StringBuilder();
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    convertToBinary(n);
  }

  public static void convertToBinary(int num) {
    if (num <= 1) {
      System.out.print(num % 2);
    } else {
      convertToBinary(num / 2);
      System.out.print(num % 2);
    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}