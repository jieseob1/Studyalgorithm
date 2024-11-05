import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    solution();
  }

  //고이는 빗물의 총량
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    //H => 세로 길이, W => 가로 길이
    int H = Integer.parseInt(st.nextToken());
    int W = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] blocks = new int[W];
    for (int i = 0; i < W; i++) {
      blocks[i] = Integer.parseInt(st.nextToken());
    }
    int sum = 0;
    for (int i = 1; i < W - 1; i++) {
      int left = 0, right = 0;
      for (int j = 0; j < i; j++) {
        left = Math.max(blocks[j], left);
      }
      for (int j = i + 1; j < W; j++) {
        right = Math.max(blocks[j], right);
      }
      if (blocks[i] < left && blocks[i] < right) {
        sum += Math.min(left, right) - blocks[i];
      }
    }
    System.out.println(sum);


  }
}