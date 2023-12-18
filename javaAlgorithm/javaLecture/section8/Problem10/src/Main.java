import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {1,0,-1,0}; // 동,남,서,북
    static int[] dy = {0,1,0,-1};
    static int[][] board = new int[7][7];
    static int total;
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i <= 6; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= 6; j++) {
                int element = Integer.parseInt(st.nextToken());
                board[i][j] = element;
            }
        }
        //해당 정보 다 넣기
        board[0][0] = 1;
        DFS(0,0);
        System.out.println(total);
    }

    public static void DFS(int x,int y) {
        if (x == 6 && y == 6) { // 도착한 경우
            total++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >=0 && ny >= 0 && nx < 7 && ny < 7 && board[nx][ny] == 0) { // 마지막 board[nx][ny] 추가
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Main.solution();
    }
}