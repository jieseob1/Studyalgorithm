import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Meeting implements Comparable<Meeting>{
  int start;
  int finish;

  public Meeting(int start, int finish) {
    this.start = start;
    this.finish = finish;
  }

  @Override
  public int compareTo(Meeting o) { //해당 부분이 중요함
    if (this.finish == o.finish) return this.start - o.start; // finish가 같은 경우를 확인해야함 =>
    else return this.finish - o.finish;
  }
}
public class Main {
  static int n,cnt;
  static int currentTime = 0;
  public static void solution() throws IOException {
    List<Meeting> meetingList = new ArrayList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      meetingList.add(new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }
    Collections.sort(meetingList);
    for (Meeting meeting : meetingList) {
      if (meeting.start >= currentTime ) {
        cnt++;
        currentTime = meeting.finish;
      }
    }
    System.out.println(cnt);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}