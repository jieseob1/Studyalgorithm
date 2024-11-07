import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
  int to;
  int cost;

  public Node(int to, int cost) {
    this.to = to;
    this.cost = cost;
  }
}
public class Main {

  static int V;
  static int E;
  static boolean[] visitied;
  static List<Node>[] list;
  static int totalCost = 0;
  public static void main(String[] args) throws IOException {
    solution();
  }

  private static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    V = Integer.parseInt(st.nextToken());
    E = Integer.parseInt(st.nextToken());

    list = new ArrayList[V + 1];
    for (int i = 1; i < V + 1; i++) {
      list[i] = new ArrayList<>(); // initialization
    }
    for (int i = 0; i < E; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int[] node = new int[3];
      int idx = 0;
      while (st.hasMoreTokens()) {
        node[idx] = Integer.parseInt(st.nextToken());
        idx++;
      }
      list[node[0]].add(new Node(node[1], node[2]));
      list[node[1]].add(new Node(node[0], node[2])); //양방향
    }
    visitied = new boolean[V + 1];
    prim(1);
    System.out.println(totalCost);
  }

  //kruskal에 대해서 구현해보기
  private static void prim(int start) {
    Queue<Node> pq = new PriorityQueue<Node>((a, b) -> a.cost - b.cost);
    pq.offer(new Node(start, 0)); //시작 노드 지점

    while (!pq.isEmpty()) {
      Node node = pq.poll();
      int to = node.to;
      int cost = node.cost;
      if (visitied[to]) {
        continue;
      }
      visitied[to] = true;
      totalCost += cost;
      for (Node next: list[to]) {
        if (!visitied[next.to]) {
          pq.offer(next);

        }
      }
    }
  }
}