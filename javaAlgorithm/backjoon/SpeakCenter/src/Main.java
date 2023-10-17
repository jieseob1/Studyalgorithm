import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

  public static int n;
  public static PriorityQueue<Integer> maxHeap, minHeap;

  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    maxHeap = new PriorityQueue<>();
    minHeap = new PriorityQueue<>();

    System.out.println(queue);
  }

  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}