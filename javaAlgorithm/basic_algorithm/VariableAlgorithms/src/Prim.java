import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Prim {
  private static class Node {
    int start;
    int cost;

    public Node(int start, int cost) {
      this.start = start;
      this.cost = cost;
    }
  }

  private void prim() {
    //1. 먼저 그래프와 방문 여부에 대해서 initailze 되어야 한다. => 그래프는 이중 리스트로 만든다.
    //2. BFS와 비슷한 방식으로 가는데, pq를 쓸거고, 첫 node의 시작점을 넣어준 뒤, while문을 돌면서 꺼내주고 방문하지 않았다면 해당 노드의 리스트를 돌면서 방문하지 않은 노드 정보를 추가해준다.

    int total = 0;
    int v = 7;
    List<Node>[] list = new ArrayList[v + 1];
    boolean[] visited = new boolean[v + 1];

    initialize(list, v);
    PriorityQueue<Node> pq = new PriorityQueue<Node>((a, b) -> a.cost - b.cost);

    pq.add(new Node(0, 0)); //아무 노드 무작위로 하나 넣는다.
    while (!pq.isEmpty()) {
      Node node = pq.poll();
      int start = node.start;
      int cost = node.cost;

      if (visited[start]) {
        continue;
      }
      visited[start] = true;
      total += cost;

      for (Node nextNode : list[start]) {
        if (!visited[nextNode.start]) {
          pq.offer(nextNode);
        }
      }
    }
  }

  private void initialize(List<Node>[] list, int v) {

    int[][] graph = {{1, 2, 29}, {1, 5, 75}, {2, 3, 35}, {2, 6, 34}, {3, 4, 7}, {4, 6, 23},
        {4, 7, 13}, {5, 6, 53}, {6, 7, 25}};


    for (int i = 1; i < v + 1; i++) {
      list[i] = new ArrayList<>();
    }

    for (int i = 0; i < graph.length; i++) {
      int a = graph[i][0];
      int b = graph[i][1];
      int w = graph[i][2];

      list[a].add(new Node(b, w));
      list[b].add(new Node(a, w));
    }
  }
}
