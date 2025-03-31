import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    private static void solution() throws IOException {
        //10,000 이하의 자연수로 이루어진 길이 N짜리 수열이 주어진다.
        // 이 수열에서 연속된 수들의 부분합 중에 그 합이 S 이상이 되는 것 중, 가장 짧은 것의 길이를 구하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N, S;
        N = Integer.parseInt(st.nextToken()); // 100,000
        S = Integer.parseInt(st.nextToken()); //100,000,000

        int arr[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;

        int left = 0;
        int right = 0;

        int sum = 0; //두 합을 더한다.
        while (true) {
            if (sum >= S) { //이상이 된다면
                min = Math.min(min, right - left); // 기존꺼랑 비교해서 최소값 넣어주고
                sum -= arr[left++];

            } else if (right == N) {
                break;
            } else {
                sum += arr[right++];
            }

        }
        if (min == Integer.MAX_VALUE) {
            System.out.println(0);
        } else System.out.println(min);
    }

}