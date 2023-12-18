import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int[] arr,ch;
  static int n,total = 0;
  static boolean flag = false;
  static String answer = "NO";


  public static void DFS(int L,int sum) {
    if (flag) {
      return;
    }
    if (sum > total / 2) {
      return ;
    } //backtracking
    if (L == n) { // 레벨 도달한 경우
      System.out.println(sum);
      if ((total - sum) == sum) {
        flag = true;
        answer = "YES";
      }
    } else {
      DFS(L + 1, sum + arr[L]);
      DFS(L + 1, sum);
    }
  }
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());

    arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      total += arr[i];
    }
    System.out.println(total);
    for (int i : arr) {
      System.out.print(i+" ");
    }
    DFS(0,0);
    System.out.println(answer);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}

//  N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때 두 부분집합의 원소의 합이 서로 같은 경우가 존재하면
//“YES"를 출력하고, 그렇지 않으면 ”NO"를 출력하는 프로그램을 작성하세요.
//    둘로 나뉘는 두 부분집합은 서로소 집합이며, 두 부분집합을 합하면 입력으로 주어진 원래의 집합이 되어 합니다.
//    예를 들어 {1, 3, 5, 6, 7, 10}이 입력되면 {1, 3, 5, 7} = {6, 10} 으로 두 부분집합의 합이 16으로 같은 경우가 존재하는 것을 알 수 있다.