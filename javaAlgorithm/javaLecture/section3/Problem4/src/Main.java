import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 연속 부분 수열
    static int n, m;
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
        int ans = 0;
        int sum = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                 ans++;
            }
            while (sum >= m) {
                sum -= arr[lt];
                lt++;
                if (sum == m) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) throws IOException {
        Main.solution();
    }
}