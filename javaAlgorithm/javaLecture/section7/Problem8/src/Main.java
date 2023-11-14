import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static int ch[] = new int[10001];
  static int cnt = 0;
  static int[] dis = {1, -1, 5};
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int s = Integer.parseInt(st.nextToken()); //현수 위치
    int e = Integer.parseInt(st.nextToken()); // 송아지 위치
    BFS(s,e);

  }

  public static void BFS(int org,int target) { //최단 거리 탐색 문제
    // 방문 여부
    //level 설정 => queue의 사이즈 만큼 돌고
    // 꺼내고, 현재 타겟이면 sout하고 끝
    // dis 만들어서 가는 방향 처리
    // next dis 변수 만들어서 방문했다고 하고, queue에 넣어주기 => 신기한점 재귀를 안씀, 걍 queue에다가 넣는걸로 함
    ch[org] = 1; //출발지점
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(org); //먼저 현수의 현재 위치를 넣는다.
    int L = 0; //level
    while (!queue.isEmpty()) {
      int len = queue.size();
      for (int i = 0; i < len; i++) {
        int cur = queue.poll(); // 현재 위치를 가지고 온다.
        if (cur == target) {
          System.out.print(L);
        }
        for (int j = 0; j < 3; j++) {
          int nx = cur + dis[j];
          if (nx >= 1 && nx <= 10000 && ch[nx] == 0) { //아직 안간곳
            ch[nx] = 1;
            queue.offer(nx);
          }
        }
      }
      L++;
    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}