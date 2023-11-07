import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static boolean[] visited;
  public static int[] parentNode;

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    visited = new boolean[n];
    parentNode = new int[n]
    ArrayList<ArrayList<Integer>> tree = new ArrayList<>();

    for (int i = 0; i < n; i++) {//n개만큼 만들어 줌
      tree.add(new ArrayList<>());
    }

    for (int i = 0; i < n; i++) { //tree 만듬
      st = new StringTokenizer(br.readLine());
      int node1 = Integer.parseInt(st.nextToken()) - 1;
      int node2 = Integer.parseInt(st.nextToken()) - 1;
      tree.get(node1).add(node2);
      tree.get(node2).add(node1);
    }

    //bfs init
    Queue<Integer> queue = new LinkedList<>();
    //BFS
//    queue.add(0);
//    visited[0] = true;
//    while (!queue.isEmpty()) {
//      int v = queue.poll(); //첫번째 노드 먼저 접근
//      for (int node : tree.get(v)) { // 1번 노드에 관련된 정보들 모두 다 도는거
//        if (visited[node] == false) { // 방문 안한경우만
//          visited[node] = true; //방문으로 해줌
//          queue.add(node); // 다음 해당 정보로 또 하위에 있는 부분으로 들어감
//          parentNode[node] = v; //해당 node의 부모는 v이다.
//        }
//
//      }
//    }



  }

  public static void DFS(int v) { //해당 간산
    if (!visited[v]) { //방문 안한 경우
      visited[v] = true; //방문 하고

    }

  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}