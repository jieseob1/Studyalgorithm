import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        int n = Integer.parseInt(sb.toString());
        int[] arr = new int[n];
        sb = new StringBuilder(br.readLine());
        //3 1 4 3 2을 각각의 인덱스에 넣어야 함
        String[] split = sb.toString().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        // 이렇게 할 필요도 없음 그냥 Arrays.sort(arr); 하면 됨 => 그리고 돌면서 이전까지의 합을 더해주면 .
        Arrays.sort(arr);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sum += arr[j];
            }
        }

        System.out.println(sum);
    }
}