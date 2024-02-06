import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  static int[] nums;
  static boolean[] visited;
  static int[] selected;
  static int n;
  static int result = Integer.MIN_VALUE;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    nums = new int[n];
    visited = new boolean[n];
    selected = new int[n];

    for(int i=0; i<n; i++){
      nums[i] = Integer.parseInt(st.nextToken());
    }
    dfs(0);

    System.out.println(result);
  }

  public static void dfs(int L) {
    if(L==n){
      result = Math.max(getResult(), result);
      return;
    }
    for(int i=0; i<n; i++){
      if(!visited[i]){ // 방문 안했으면
        visited[i] = true;
        selected[L] = nums[i]; // 방문 하고, 현재 
        for (int i1 : selected) {
          System.out.print(i1+" ");
        }
        System.out.println();
        dfs(L+1);
        for (boolean b : visited) {
          System.out.print(b+" ");
        }
        System.out.println();
        visited[i] = false;
      }
    }
  }

  public static int getResult(){
    int sum=0;
    for(int i=0; i<n-1; i++){
      sum += Math.abs(selected[i]-selected[i+1]);
    }
    return sum;
  }
}