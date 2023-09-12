import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  private static int n;
  private static String[] arr;
  public void solution() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    arr = new String[n];
    st = new StringTokenizer(br.readLine());
    String str = st.nextToken();
    HashMap<Character, Integer> map = new HashMap<>();
    //toCharArray,getOrDefault, keySet,get, containsKey
    for (char s : str.toCharArray()) { // to chararray가 중요함
      map.put(s, map.getOrDefault(s,0) + 1); // 이거 중요함
    }

    int max = Integer.MIN_VALUE;
    char ans = ' ';
    for (char x : map.keySet()) { //키들만 뽑아냄
//      System.out.println(x);
//      System.out.println(x + " " + map.get(x));
      if (map.get(x) > max) {
        max = map.get(x);
        ans = x;
      }
    }
      System.out.println(ans);


//    map.put('A', 3);
  }

  public static void main(String[] args) throws Exception {
    new Main().solution();
  }
}