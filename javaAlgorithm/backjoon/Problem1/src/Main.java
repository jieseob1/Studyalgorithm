import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  static int n,m;
  static int[] nArr, mArr;

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    List<Integer>
    n = Integer.parseInt(st.nextToken());
    nArr = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      nArr[i] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    m = Integer.parseInt(st.nextToken());
    mArr = new int[m];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) {
      mArr[i] = Integer.parseInt(st.nextToken());
    }
    int p1 = 0;
    int p2 = 0; // 해당 부분 nArr, mArr 관련되서 사용하기 위함

  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}