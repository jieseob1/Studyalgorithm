import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws IOException {
        //메모리: 265172	KB, 시간: 1832 ms
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }//n
        int[] copiedArr = arr.clone();
        Arrays.sort(copiedArr); //nlogn

        Map<Integer, Integer> map = new HashMap<>(); // number, 갯수
        int rank = 0;
        for (int i : copiedArr) {
            if(map.get(i) == null) {
                map.put(i, rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);

    }
    public static void main(String[] args) throws IOException {
        Main.solution();
    }
}