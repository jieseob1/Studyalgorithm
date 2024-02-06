import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  static int n,c;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken()); // 집 갯수
    c = Integer.parseInt(st.nextToken()); // 공유기 갯수
    int[] arr = new int[n + 1];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);

    int maxResult = 0;
    int left = 1;
    int right = arr[n - 1];
    int dist = 0;
    int ans = 0;
    while (left <= right) {
      int mid = (left + right) / 2;
      int start = arr[1];
      int count = 1;  // 공유기 설치 GAP 저장
      for (int i = 1; i <= n; ++i) {
        dist = arr[i] - start;  // 집마다 거리 체크
        if (dist >= mid) {  // 공유기 설치 가능한지 여부 체크
          count++;
          start = arr[i]; // 설치 했다면 여기 집 부터 다시 거리 체크
        }
      }
      if (count >= c) { // 갯수 초과하거나 가능한 경우
        ans = mid;
        left = mid +1;
      } else {
        right = mid -1;
      }
    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}