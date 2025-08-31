import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int H, W;

    public static void main(String[] args) throws IOException {
        solution();

    }

    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[W];
        for (int i = 0; i < W; i++) {
            int block = Integer.parseInt(st.nextToken());
            if (block > H) {
                System.out.println("0");
                return;
            }
            arr[i] = block;
        }

        if (arr.length == 1) {
            System.out.println("0");
            return;
        }
        int sum = 0;
        int left = 0;
        int right = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            right = i;
            if (arr[left] <= arr[right]) { //right가 더 커지거나 똑같은 경우 => 이떄 빗물을 계산한다.
                int min = Math.min(arr[left], arr[right]);
                for (int k = left; k < right; k++) {
                    if (min - arr[k] > 0) {
                        sum += (min - arr[k]);
                    }
                }
                left = i; // 그 다음에 left를 돌린다.
            } else if (right == arr.length - 1) {
                int min = Math.min(arr[left], arr[right]);
                for (int k = left; k < right; k++) {
                    if (min - arr[k] > 0) {
                        sum += (min - arr[k]);
                    }
                }
            }

        }
        System.out.println(sum);

    }
}