import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  static int k, n;
  static String[] words;
  static boolean[] visited;
  static int max = 0;

  public static void main(String[] args) throws IOException {
    solution();
  }

  public static void solution() throws IOException {
    //K개의 글자만 알려줄 수 있음 => k개의 글자로 이루어진 단어만 읽을 수 있다.
    //남극언어의 모든 단어는 "anta"로 시작되고, "tica"로 끝난다. 남극언어에 단어는 N개 밖에 없다
    //학생들이 읽을 수 있는 최댓값

    //n < 50, k <= 26
    //antic를 포함해서  k-5만큼 알때 최대한도로 많이 알 수 있는 방법

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());
    words = new String[n];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      words[i] = st.nextToken().replaceAll("anta", "").replaceAll("tica", "");
    }

    if (k < 5) {
      System.out.println(0);
      return;
    } else if (k == 26) {
      System.out.println(n); //모두 표현 가능
      return;
    }
    visited = new boolean[26]; // 알파벳 대로 할거고, character로 해서 숫자 집어 넣을 거임
    visited['a' - 'a'] = true;
    visited['n' - 'a'] = true;
    visited['t' - 'a'] = true;
    visited['i' - 'a'] = true;
    visited['c' - 'a'] = true;

    backTracking(0, 0);
    System.out.println(max);

  }

  public static void backTracking(int alphabet, int len) {
    if (len == k - 5) { // 만약 도착하게 된다면
      int count = 0;
      for (int i = 0; i < n; i++) {
        boolean read = true;
        for (int j = 0; j < words[i].length(); j++) {
          if (!visited[words[i].charAt(j) - 'a']) { //모두 방문 가능하다면
            read = false;
            break;
          }
        }
        if (read) {
          count++;
        }
      }
      max = Math.max(max, count);

    } else {
      for (int i = alphabet; i < 26; i++) {
        if (visited[i] == false) {
          visited[i] = true;
          backTracking(i+1, len + 1);
          visited[i] = false;
        }
      }
    }
  }
}