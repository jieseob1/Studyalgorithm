import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {
    private static final int MAX_NODE = 100000;
    static final int INF = 1_000_000_000;
    public static void main(String[] args) throws IOException {
        solution();
    }

    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] dist = new int[MAX_NODE+1];
        Arrays.fill(dist, INF); // 0으로 모두 다 초기화 해주고

        bfs(n, k,dist);
    }

    private static void bfs(int src, int dst, int[] dist) {
        Deque<Integer> q = new ArrayDeque<>();
        q.add(src);
        dist[src] = 0;

        while (!q.isEmpty()) {
            int curNode = q.pollFirst(); // 처음 꺼낸 노드 정보
            int curSecond = dist[curNode]; // 현재 거리의 시간초

            if (curNode == dst) {
                System.out.println(curSecond);
                return;
            }
            int nextNode = curNode * 2;
            if (nextNode <= MAX_NODE && dist[nextNode] > curSecond) { // 왜 dist[nx] >= cur이 아니지
                dist[nextNode] = curSecond;
                q.addFirst(nextNode);
            }
            nextNode = curNode -1;
            if (nextNode >= 0 && dist[nextNode] > curSecond + 1) {
                dist[nextNode] = curSecond + 1;
                q.addLast(nextNode);

            }

            nextNode = curNode + 1;
            if (nextNode <= MAX_NODE && dist[nextNode] > curSecond + 1) {
                dist[nextNode] = curSecond + 1;
                q.addLast(nextNode);
            }
        }

        System.out.println(dist[dst]);

    }
}