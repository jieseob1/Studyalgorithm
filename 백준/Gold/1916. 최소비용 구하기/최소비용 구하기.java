import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class Node {
  int from;
  int to;
  int cost;

  public Node(int from, int to, int cost) {
    this.from = from;
    this.to = to;
    this.cost = cost;
  }
}

public class Main {

  static int[] dist; // 거리 관련 dist list
  static int N, M;
  static int origin, distance;
  static Node[] nodes;

  public static void main(String[] args) throws IOException {
    solution();
  }

  private static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    M = Integer.parseInt(st.nextToken());

    dist = new int[N + 1];
    nodes = new Node[M + 1];
    Arrays.fill(dist, Integer.MAX_VALUE);

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int from = Integer.parseInt(st.nextToken());
      int to = Integer.parseInt(st.nextToken());
      int cost = Integer.parseInt(st.nextToken());
      nodes[i] = new Node(from, to, cost);
    }

    st = new StringTokenizer(br.readLine());
    origin = Integer.parseInt(st.nextToken());
    distance = Integer.parseInt(st.nextToken());

    bellman_ford(origin); // 하고 나온 dist의 결과를 보면 될듯?
    System.out.println(dist[distance]);
  }

  private static void bellman_ford(int start) {
    //벨만 포드는 n번의 노드를 방문하면서 1번 순회시 마다  간선수만큼 돌면서 업데이트를 진행한다.
    dist[start] = 0;
    for (int i = 1; i < N + 1; i++) {
      for (int j = 0; j < M ; j++) { //간선이라고 한다면 결국 node의 정보를 꺼내는 것
        int cur = nodes[j].from;
        int next = nodes[j].to;
        int cost = nodes[j].cost;
        if(dist[cur] == Integer.MAX_VALUE)
          continue;
        if (dist[next] > dist[cur] + cost) {
          dist[next] = dist[cur] + cost;
        }
        if (i == N) return;
      }
    }
  }
}