public class Kruskal {
  //비용을 오름차순으로 정렬한뒤, merge 적용하고 나서 total Cost를 적용하는 방식
  private static class Edge {
    int start;
    int end;
    int cost;

    public Edge(int start, int end, int cost) {
      this.start = start;
      this.end = end;
      this.cost = cost;
    }
  }

  // 유니온 파인드 구현
  private static class Node {
    int depth = 1;
    Node parent = null;

    public boolean isConnected(Node o) {
      return root() == o.root();
    }

    private void merge(Node o) {
      if (isConnected(o)) {
        return;
      }

      Node root1 = root();
      Node root2 = o.root();
      if (root1.depth > root2.depth) {
        root2.parent = root1;
      } else if (root2.depth > root1.depth) {
        root1.parent = root2;
      } else {
        root2.parent = root1;
        depth++;
      }
    }

    private Node root() {
      if (parent == null) {
        return this;
      }
      return parent.root(); // 현재 노드가 있으면, 현재 노드의 parent의 루트를 따라 올라간다.
    }
  }

  //해당 정보로 각각에 맞는 Edge정보 만든 뒤, PriorityQueue로 cost 오름차순으로 만든뒤, 하나씩 빼면서 연결 정보 확인한다음에, 연결 안되어 있는 경우에는 totalCost에 cost를 더해주면 된다.


}
