import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  private static int k;
  private static List<List<Integer>> list = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    solution();
  }

  public static void solution() throws IOException {
    int cnt = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    while (true) {
      st = new StringTokenizer(br.readLine());
      k = Integer.parseInt(st.nextToken());
      if (k == 0) {
        break;
      }
      list.add(new ArrayList<>());
      for (int i = 0; i < k; i++) {
        list.get(cnt).add(Integer.parseInt(st.nextToken()));
      }
      cnt++;
    }

    for (List<Integer> integers : list) {
      boolean[] isVisited = new boolean[integers.size()];
      int[] resultArr = new int[6];
      combination(0, 0, integers, isVisited, resultArr);
      System.out.println();
    }

  }

  private static void combination(int detph, int start, List<Integer> arr, boolean[] isVisited,
      int[] resultArr) {
    if (detph == 6) {
      for (int i = 0; i < 6; i++) {
        System.out.print(resultArr[i] + " ");
      }
      System.out.println();
    } else {
      for (int i = start; i < arr.size(); i++) {
        if (isVisited[i]) {
          continue;
        }
        isVisited[i] = true;
        resultArr[detph] = arr.get(i);
        combination(detph + 1, i + 1, arr, isVisited, resultArr);
        isVisited[i] = false;
      }
    }
  }
}