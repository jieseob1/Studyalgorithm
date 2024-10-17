public class UnionFind {
  //첫번째 방법
  private static class Node {
    Node parent = null;
    int depth = 1;

    //연결되었는지 확인
    public boolean isConnected(Node node) {
      return root() == node.root(); //공통 조상을 재귀를 통해서 확인한다.
    }

    //merge해서 서로 연결하는 동작

    private void merge(Node node) {
      if (isConnected(node)) return;

      Node root1 = root(); // 조상 가지고 옴
      Node root2 = node.root(); // 왜 여기에 root를 할당할가

      if (root1.depth > root2.depth) {
        root2.parent = root1;
      } else if (root2.depth > root1.depth){
        root1.parent = root2;
      } else{
        root2.parent = root1;
        depth++;
      }

    }

    //root인지 확인후 내뱉는 동작
    private Node root() {
      if (parent == null) return this;
      return parent.root();
    }
  }

  int n = 10;
  int[] parents = new int[n];
  int[][] graph = {{1,2},{2,3},{3,4},{5,6},{6,7},{7,8},{9,10}};

  //parents initialization
  private void initialize() {
    for (int i = 1; i <= n; i++) {
      parents[i] = i;
    }
  }

  private void unionFind() {
    for(int i=0; i<graph.length; i++) {
      int a = graph[i][0];
      int b = graph[i][1];

      union(a,b);
    }
  }
  //위에서 머지와 같은 역할
  private void union(int x, int y) {
    x = find(parents, x);
    y = find(parents, y);
    // 더 find 값으로 부모 노드 설정
    if (x < y) {
      parents[y] = x;
    }
    else {
      parents[x] = y;
    }
  }

  //찾는 역할 => 위에서 root와 비슷한 역할
  private int find(int[] parents, int x) {
    if (parents[x] == x) return x;
    return find(parents, parents[x]); //x의 부모 전달
  }
}
