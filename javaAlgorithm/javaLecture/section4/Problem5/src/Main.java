import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

//k번째 큰수
public class Main {

  public static int[] arr;
  public static void solution() throws IOException {
    int answer = -1;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // 3~100
    int k = Integer.parseInt(st.nextToken()); // 1~50

    /*
    Treeset
    1. add
    2. remove 특정값 제거 remove(143);
    3.size
    4. first: 맨 앞 자료
    5. last: 맨 뒷 자료
     */
    TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder()); //set: 중복 제거
    //treeset: 오름차순, 내림차순 위함 중복 제거 +정렬도 해줌

    arr = new int[n+1];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    for (int i = 0; i < n; i++) { // n개중 3개 뽑는거 3중 for문 써서 for문
      for (int j = i + 1; j < n; j++) {
        for (int l = j + 1; l < n; l++) {
          set.add(arr[i] + arr[j] + arr[l]);
        }
      }
    }
    int cnt = 0;
    for (int x : set) {
      cnt++;
      if (cnt == k) {
        answer = x;
      }
    }
    System.out.println(answer);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}