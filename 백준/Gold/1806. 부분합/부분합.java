import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int N, S;

  public static void main(String[] args) throws IOException {
    solution();
  }

  private static void solution() throws IOException {
//    10,000 이하의 자연수로 이루어진 길이 N짜리 수열이 주어진다.
//    이 수열에서 연속된 수들의 부분합 중에 그 합이 S 이상이 되는 것 중, 가장 짧은 것의 길이를 구하는 프로그램을 작성하시오.

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    S = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int  left = 0;
    int right = 0;
    int len = arr.length-1;
    int currentSum = 0;
    int minLen = Integer.MAX_VALUE;
    while (right < N || (currentSum >= S)) {
      if (currentSum < S) {

        currentSum += arr[right++];
      } else {
        minLen = Math.min(minLen, right - left);
        currentSum -= arr[left++];

      }
    }
    int  result = (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    System.out.println(result);
    }


}