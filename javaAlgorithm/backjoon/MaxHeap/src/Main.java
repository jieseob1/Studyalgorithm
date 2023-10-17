import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

  public static int n;

  public static PriorityQueue<Integer> queue;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());

    queue = new PriorityQueue(Collections.reverseOrder());
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int num = Integer.parseInt(st.nextToken());
      if (num == 0) {
        if (queue.isEmpty()) {
          System.out.println(0);
        } else {
          System.out.println(queue.poll());
        }
      } else {
        queue.add(num);
      }
    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}