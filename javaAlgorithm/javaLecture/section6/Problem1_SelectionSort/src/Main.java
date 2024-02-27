import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int n;
  static int[] arr;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    selectionSort();
    for (int i : arr) {
      System.out.print(i+" ");
    }
  }

  private static void selectionSort() {
    for (int i = 0; i < n-1; i++) {
      int idx = i; // 시작하는 부분을 index로 하고
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[idx]) { // j 인덱스 부분이 더 작은 값을 가지고 있다면
          idx = j;
        }
      }
      int tmp = arr[i];//원래 값을 넣어주고
      arr[i] = arr[idx]; // minimal한 idx값을 arr[i]에 넣어줌
      arr[idx] = tmp;
    }

  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}