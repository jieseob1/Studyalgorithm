import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  public static int n;
  static Queue<Integer> queue;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    queue = new LinkedList<>();
    for (int i = 1; i < n+ 1; i++) {
      queue.offer(i);
    }

    while (queue.size() >= 2) {
      disgardFirstOne();
      putFirstCardAtEnd();
    }
    int ans = queue.poll();
    System.out.println(ans);

  }

  private static void disgardFirstOne() {
    queue.remove();
  }

  private static void putFirstCardAtEnd() {
    int temp = queue.poll();
    queue.offer(temp);
  }


  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}