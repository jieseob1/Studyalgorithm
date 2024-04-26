import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());

    int[] cityBetweenDistance = new int[n - 1];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n - 1; i++) {
      int cityDistance = Integer.parseInt(st.nextToken());
      cityBetweenDistance[i] = cityDistance;
    }

    int[] cityOilPrice = new int[n];
    int minVal = 0;
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      int oilPrice = Integer.parseInt(st.nextToken());
      cityOilPrice[i] = oilPrice;
    }
    // 내림차순으로 확인 해야 되누 => 내림차순이면 저장해서 해당 정보로 가격 계속 추가
//    https://developer-ping9.tistory.com/282
    int sum = 0;
    minVal = cityOilPrice[0];
    for (int i = 0; i < n-1; i++) {
      sum += minVal * cityBetweenDistance[i];
      if (minVal > cityOilPrice[i+1]) minVal = cityOilPrice[i+1];
    }
    System.out.println(sum);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}