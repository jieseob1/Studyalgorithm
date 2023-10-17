import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


class Edge implements Comparable<Edge> {

  //간선 하나하나 객체로
  public int v1;
  public int v2;
  public int cost;

  Edge(int v1, int v2, int cost) {
    this.v1 = v1;
    this.v2 = v2;
    this.cost = cost;
  }
  @Override
  public int compareTo(Edge ob) { // 오름차순 배열
    return this.cost - ob.cost;
  }
}

public class Main {

  //모든 도시 연결, 최소의 유지비용 => 나머지 도록는 폐쇄 => 모든 간선 연결된 트리 + 가중치 최솟값 정점:n, 간선: N-1
  // find 해서 그룹이 같더라 => circle 생성
  public static int[] unf;
  public static int Find(int v) { //찾는 기능
    if (v == unf[v]) { //idx == 집합
      return v;
    } else {
      return unf[v] = Find(unf[v]);
    }
  }
  public static void Union(int a, int b) { //나는 합치는 기능이여
    int fa = Find(a);
    int fb = Find(b);
    if (fa != fb) {
      unf[fa] = fb;
    }

  }
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    unf = new int[n + 1];
    ArrayList<Edge> arr = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      unf[i] = i;
    }
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      arr.add(new Edge(a, b, c));
    }
    int answer = 0; //최소비용 누적
    Collections.sort(arr); //arr 오름차순 정럴 ??
    for (Edge ob : arr) {
      int fv1 = Find(ob.v1);
      int fv2 = Find(ob.v2);
      if (fv1 != fv2) {
        answer += ob.cost;
        Union(ob.v1, ob.v2); // 한집합으로 묶어주기
      }
    }
    System.out.println(answer);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}