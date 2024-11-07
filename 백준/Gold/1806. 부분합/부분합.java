import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  //10,000 이하의 자연수로 이루어진 길이 N짜리 수열이 주어진다.
  // 이 수열에서 연속된 수들의 부분합 중에 그 합이 S 이상이 되는 것 중, 가장 짧은 것의 길이를 구하는 프로그램을 작성하시오.

  //첫째 줄에 N (10 ≤ N < 100,000)과 S (0 < S ≤ 100,000,000)가 주어진다.
  // 둘째 줄에는 수열이 주어진다. 수열의 각 원소는 공백으로 구분되어져 있으며, 10,000이하의 자연수이다.

  static int N;
  static int S;
  static int min = Integer.MAX_VALUE;

  public static void main(String[] args) throws IOException {
    solution();
  }

  //3구 달린 멀티탭 쓸때 => 사용순
  private static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    S = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine()," ");
    int[] arr = new int[N];
    int idx = 0;
    while (st.hasMoreTokens()) {
      arr[idx] = Integer.parseInt(st.nextToken());
      idx++;
    }
    // 투포인터를 이용해서 S를 넘으면 min값 저장하고 left값을 계속 낮추는식으로 해보면 좋을듯
    int left = 0;
    int right = 0;
    int sum = 0;

    while (true) {
      if (sum >= S) {
        min = Math.min(min, (right - left));
        sum -= arr[left++]; //left값을 추가
      } else if (right == N) {
        break;
      } else { //sum이 S를 못 넘는 경우
        sum += arr[right++]; // 오른쪽을 추가
      }
    }
    if(min == Integer.MAX_VALUE) System.out.println(0);
    else System.out.println(min);
  }
}