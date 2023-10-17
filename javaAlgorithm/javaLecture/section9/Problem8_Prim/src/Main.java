import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Edge implements Comparable<Edge> {

  public int vex; //정점
  public int cost; // 비용

  Edge(int vex, int cost) {
    this.vex = vex;
    this.cost = cost;
  }
  @Override
  public int compareTo(Edge o) { //PQ에서 작은값으로 우선순위
    return this.cost - o.cost;
  }
}
public class Main {
  //최소가 우선순위

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>(); // 인접 리스트 만드는거 => 다익스트라에서 했었음
    for (int i = 0; i < m; i++) {
      //객체 만드는 과정
      graph.add(new ArrayList<Edge>());
    }

    int[] ch = new int[n + 1];
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      graph.get(a).add(new Edge(b, c)); //get a를 왜 하지
      graph.get(b).add(new Edge(a, c)); //무방향이므로 둘다 해줘야한다.
    }
    int answer = 0; // cost sum
    PriorityQueue<Edge> pQ = new PriorityQueue<>(); // 비용에서 최솟값을 우선순위로 한다. => compareTo 때문에
    pQ.offer(new Edge(1, 0)); // 1번 정점 cost 0을 넣어준다.
    while (!pQ.isEmpty()) {
      Edge tmp = pQ.poll();//Retrieve and Remove
      int ev = tmp.vex;//endpoint Cost
      if (ch[ev] == 0) {
        ch[ev] = 1; // change to Check
        answer += tmp.cost;
        /*
        예를 들어서 1번에서 2번으로 가는게 12의 cost가 든다.
        그럼 ev = tmp.vex는 2번노드를 가져오는거고, tmp.cost는 그에 해당하는 코스트 12를 가져온다.
        이후 아래 for문은 2번과 연결된 다른 노드와 그에 따른 cost 들을 가지고 와서 아직 연결이 안되어있으면 넣어준다. 1로 가는것을 체크하면 다시 1번으로 넘어가는것까지 넣어주게 된다.
         */
        for (Edge edge : graph.get(ev)) { //해당 vertex를 가져와 연결되어  있는 모든 Edge들 돈다.
          if (ch[edge.vex] == 0) {
            pQ.offer(new Edge(edge.vex, edge.cost));
          }
        }

      }

    }
  }

  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}