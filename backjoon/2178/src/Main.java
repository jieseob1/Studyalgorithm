import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        //N×M크기의 배열로 표현되는 미로가 있다.
        //미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸
        // (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];

        createMap(N, st, M, map, br);
        bfs(N, M, map);
        System.out.println(map[N - 1][M - 1]);

    }

    private static void bfs(int N, int M, int[][] map) {
        boolean[][] visited = new boolean[N][M];
        Queue<int[]> queue = new LinkedList<>(); // queue는 linked list를 사용
        queue.add(new int[]{0, 0}); // 0,0부터 시작
        visited[0][0] = true;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i]; // nx,ny를 두고서
                if (nx >= 0 && ny >= 0 && nx < N && ny < M) { // 배열 범위 안에서 움직이는지 확인
                    if (map[nx][ny] == 1 && !visited[nx][ny]) { // 1이고, 방문 안했으면
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true; // queue에다가 넣고 방문으로 표시
                        map[nx][ny] = map[x][y] + 1; // 이동 칸 수 증가
                    }
                }
            }
        }
    }

    private static void createMap(int N, StringTokenizer st, int M, int[][] map, BufferedReader br) throws IOException {
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }
    }
}