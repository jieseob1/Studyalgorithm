import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Player implements Comparable<Player> {
  int height;
  int weight;

  public Player(int height, int weight) {
    this.height = height;
    this.weight = weight;
  }

  @Override
  public int compareTo(Player o) {
    return o.height - this.height; //내림차순
  }
}
public class Main {
  //좌표 정렬
  static int n,cnt;
  static List<Player> playerList;
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());

    playerList = new ArrayList<>();
    //만드는 과정
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int height = Integer.parseInt(st.nextToken());
      int weight = Integer.parseInt(st.nextToken());
      playerList.add(new Player(height, weight));
    }
    Collections.sort(playerList);// 위에 만들어놓은 compareto 기준에 따라 정렬된다.

    int max = Integer.MIN_VALUE;
    for (Player player : playerList) {
      System.out.println("height: "+ player.height + "weight: "+ player.weight);
    }
    for (Player player : playerList) {
      //몸무게의 최대값만
      if (player.weight > max) { // 아래는 다 키가 작은 사람들이이니까,
        max = player.weight;
        cnt++;
      }
    }
    //(183,65) ,(180,70), (170,72) 선발
    //(181,60)은 (183,65)보다 키,몸무게 모두 낮아서 탈락
    //(172,67)은 (180,70) 때문에 탈락
    System.out.println(cnt);
  }


  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}