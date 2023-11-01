import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    Queue<Integer> queue = new LinkedList<>(); //이렇게 쓰는거고만

    for (int i = 1; i <= n; i++) {
      queue.add(i);
    }
    while (queue.size() > 1) {
      for (int i = 0; i < k-1; i++) {
        queue.add(queue.poll());
      }
      queue.poll();
    }
    int answer = queue.poll();
    System.out.println(answer);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}