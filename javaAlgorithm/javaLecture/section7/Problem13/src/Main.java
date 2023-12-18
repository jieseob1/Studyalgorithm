import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
//  인접 리스트 => 정점이 엄청 많게 될떄 사용한다.
//  n이 1000개 10000개라면 => 인접 행렬은, 2차원 배열 10000x10000
  //또한 갈 수 있는것을 살피려면 1부터 10만까지 살펴야 한다.

  static int n,m, answer=0;
  static ArrayList<ArrayList<Integer>> graph;
  static int[] ch;

  public static void DFS(int v) { //방문 정점
    if (v == n) { //n번으로 가는 정수도착 하면
      answer++;
    } else { // 도착한 게 아니라면,
      for (int nextV : graph.get(v)) {
        if (ch[nextV] == 0) {
          ch[nextV] = 1;
          DFS(nextV);
          ch[nextV] = 0;
        }
      }
    }
  }
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    graph = new ArrayList<ArrayList<Integer>>();

    for (int i = 0; i < n; i++) {
      graph.add(new ArrayList<Integer>());// n만큼 arrayList추가해주기
    }
    ch = new int[n+1];
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      graph.get(a).add(b); // a정점을 가지고 와서 b를 넣어준다.
    }
    ch[1] = 1;
    DFS(1);
    System.out.println(answer);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}