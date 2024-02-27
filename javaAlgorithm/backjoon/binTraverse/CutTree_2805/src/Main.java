import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
  static int n,m;
  static int[] arr;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    arr = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    //여기서 따로 정렬함
//    binTraverse();
  }

  private void binTraverse() {
    // 여기서 lt와 rt를 잡고 mid 를 구한 뒤, while 문을 써서 계속 작업해나가는 방식으로
  }
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}