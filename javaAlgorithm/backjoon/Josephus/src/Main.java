import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  public static int n,k;
  private static Queue<Integer> queue;
  private  static  int[] arr;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());
    queue = new LinkedList();
    arr = new int[n];
    ArrayList<Integer> arrList = new ArrayList<>();
    for (int i = 1; i < n + 1; i++) {
      queue.add(i);
    }

    while(!queue.isEmpty()) {
      toTheKTimesBack();
      addToArray(arrList);
    }
    for (int i = 0; i < arrList.size(); i++) {
      sb.append(arrList.get(i));
      if(i != arrList.size() -1) {
        sb.append(", ");
      }
    }
    System.out.println("<"+sb+">");
  }


  private static void toTheKTimesBack() {
    for (int i = 0; i < k-1; i++) {
      int temp = queue.poll();
      queue.add(temp);
    }
  }

  private static void addToArray(ArrayList arr) {
    arr.add(queue.poll());
  }


  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}