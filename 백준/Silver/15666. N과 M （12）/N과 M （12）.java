import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

  private static int N;
  private static int M;

  public static void main(String[] args) throws IOException {
    Main.solution();
  }

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken()); // string to int
    M = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int[] arr2 = Arrays.stream(arr).sorted().toArray(); // 2가지 방법 있는 듯
//    List<Integer> arr2= Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
    int[] currentArr = new int[M];
    Set<List<Integer>> result = new LinkedHashSet<>(); //순서 보장
    permutation(arr2, 0, result, currentArr,0);
    for (List<Integer> integers : result) {
      for (Integer integer : integers) {
        System.out.print(integer + " ");
      }
      System.out.println();
    }
  }

  private static void permutation(int[] arr, int depth, Set<List<Integer>> result,
      int[] currentArr, int flag) {
    if (depth == M) {
      result.add(Arrays.stream(currentArr).boxed().collect(Collectors.toList()));
      return;
    } else {
      if (flag >= N) {
        return;
      }
      for (int i = flag; i < N; i++) { // 0 ,1 ,2 
        currentArr[depth] = arr[i];// 0,0 0,1 0,2 1,1, 1,2 ,2, 2 이렇게 됨
        permutation(arr, depth + 1, result, currentArr, i); // 0 , 0 
      }
    }
  }
}