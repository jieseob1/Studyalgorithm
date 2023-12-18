import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  //배열에다가 거리를 쓰는 방법도 있음 => dis라는걸 만들어서 얼마나 걸리는지를 사용할 수 있다.
  static int n,m;
  static ArrayList<ArrayList<Integer>> graph;
  static int[] ch, dis;
  Queue<Integer> queue;

  public static void BFS(int v) {
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(v);
    ch[v] = 1;
    dis[v] = 0;
    while (!queue.isEmpty()) {
      int cv = queue.poll();
      for (int nv : graph.get(cv)) {
        if (ch[nv] == 0) { //아직 방문 안했다면
          ch[nv] = 1; //방문하게 해주고
          queue.offer(nv);// queue에다가 넣어주기
          dis[nv] = dis[cv] + 1; //다음 방문 부분을 현재 +1 로만들어 준다.
        }
      }
    }



  }
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    ch = new int[n + 1];
    dis = new int[n + 1];
    graph = new ArrayList<ArrayList<Integer>>();

    for (int i = 0; i <+ n; i++) {
      graph.add(new ArrayList<Integer>());
    }
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      graph.get(a).add(b); // a노드에 b넣는 과정
    }

    BFS(1);
    for (int i = 2; i <= n; i++) {
      System.out.println(i+" : " + dis[i]);
    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();

  }
}