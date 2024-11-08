import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    solution();
  }

  private static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    long S = Long.parseLong(st.nextToken());
    //서로 다른 N개의 자연수의 합이 S다 => 자연수 N의 최댓값은?
    //N이 최대가 될 수 있게끔 만드는 건가 => 어떻게 하면 n이 최대일 수 있을까
    long sum = 0;
    int cnt = 0;
    int idx = 1;
    while (true) {
      if(sum + idx > S) break;
      sum += idx;
      idx++;
      cnt++;
    }

    System.out.println(cnt);
  }
}