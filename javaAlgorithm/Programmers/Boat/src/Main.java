import java.util.Arrays;

public class Main {

  public static int solution(int[] people, int limit) {
    //투포인터로 해결
    int answer = 0;
    Arrays.sort(people);
    // 투 포인터
    int left = 0;
    int right = people.length - 1;
    int cnt = 0;
    while (left <= right) {
      if (people[left] + people[right] <= limit) {
        cnt++;
        left++;
        right--;
        continue;
      } else if (people[left] + people[right] > limit) {
        cnt++;
        right--;
      }
    }
    answer = cnt;
    return answer;
  }
  public static void main(String[] args) {
    Main.solution(new int[]{70, 50, 80, 50}, 100);
  }
}