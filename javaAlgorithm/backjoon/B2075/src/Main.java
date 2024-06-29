import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void BasicSortSolution() throws IOException {
        //메모리: 354132KB, 시간: 1824ms
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n * n];
        int[] clonedarr = new int[n * n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i * n + j] = num;
            }
        }
        clonedarr = Arrays.stream(arr).boxed().sorted((v1,v2) -> v2-v1).mapToInt(Integer::intValue).toArray(); // 실제 arr에 영향을 주지 않음
        System.out.println(clonedarr[n-1]);
    }
    public static void solution() throws IOException {
        //메모리: 273884KB, 시간: 740ms
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1); // INITIAL_CAPACITY 왜 넣지?
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                pq.offer(num);
            }
        }
        for (int i = 0; i < n - 1; i++) {
            pq.remove();
        }
        int ans = pq.peek();
        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        Main.BasicSortSolution();
    }
}