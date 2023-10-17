import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static int[] unf;
  public static void kruskal() {
    /*
    간선의 가중치의 합이 최솟값이 되도록 모든 노드 연결
    가중치가 가장 작은 간선일수록,최소 스패닝 트리에 포함된다는 바상
    - 그래스의 모든 간선의 가중치 오름차순 정렬, 스패닝 트리에 하나씩 추가
    - 가중치가 작다고 해서 무조건 간선에 트리를 더하는 것은 아님 => 사이클을 이룰 수 도 있음
    - 모든 간선 한번씩 검사 한 뒤 종료
    - union-find를 활용해 구현 => 집한 한개는 그래프의 한 컴포넌트 표현
     */

  }


  public static int Find() {

  }

  public static boolean union(int a, int b) { // 다른 집합 같은 집합으로 변경
    int fa = unf[a];
    int fb = unf[b];
    if (fa != fb) {
      unf[fb] = unf[fb];
    }
  }
  public static void prim() {

  }
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());


  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}