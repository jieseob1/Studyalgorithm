import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


class Time implements Comparable<Time>{
  int time;
  char state;

  public Time(int time, char state) {
    this.time = time;
    this.state = state;
  }

  @Override
  public int compareTo(Time o) {
    if (this.time == o.time) {
      return this.state - o.state;
    }
    return this.time - o.time;
  }
}
public class Main {
  static int n,cnt,answer;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    List<Time> arr = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      arr.add(new Time(Integer.parseInt(st.nextToken()), 's'));
      arr.add(new Time(Integer.parseInt(st.nextToken()), 'e'));
    }

    Collections.sort(arr);
    for (Time Time : arr) {
      System.out.println("Time start:" + Time.time + "Time end: "+ Time.state);
    }
    for (Time ob : arr) {
      if(ob.state=='s') cnt++;
      else cnt--;
      answer=Math.max(answer, cnt);
    }
    System.out.println(answer);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}