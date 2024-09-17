import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  private static int N;
  private static int minResult = Integer.MAX_VALUE;
  public static void main(String[] args) throws IOException {
    Main.solution();
  }

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    int[] sList = new int[N]; //신맛
    int[] bList = new int[N];//쓴맛

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      sList[i] = Integer.parseInt(st.nextToken());
      bList[i] = Integer.parseInt(st.nextToken());
    }

    dfs(sList,bList,0,1,0);
    System.out.println(minResult);
  }

  private static void dfs(int[] sList, int[]bList,int depth, int currentS, int currentB) {
    if (depth == N) {
      if (currentS == 1 && currentB == 0) return;
      minResult = Math.min(minResult, Math.abs(currentS - currentB));
      return;
    } else{
      dfs(sList,bList,depth+1, currentS * sList[depth],currentB + bList[depth]);
      dfs(sList,bList,depth+1, currentS,currentB);
    }
  }


}