import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

  public static void solution() throws IOException {
    int ans = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    String S = st.nextToken();
    st = new StringTokenizer(br.readLine());
    String T = st.nextToken();
//    s문자열에서 t문자열과 아나그램이 되는 s의 부분문자열
    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();

    for (char c : T.toCharArray()) {
      map2.put(c, map2.getOrDefault(c,0)+1);
    }
    for (int i = 0; i < T.length() - 1; i++) { // t-1까지만 넣어놓자
      map1.put(S.charAt(i), map1.getOrDefault(S.charAt(i), 0) + 1);
    }
    int lt = 0;
    for (int rt = T.length()-1; rt < S.length(); rt++) {
      map1.put(S.charAt(rt), map1.getOrDefault(S.charAt(rt), 0) + 1);
      if (map1.equals(map2)) {
        ans++;
      }
      map1.put(S.charAt(lt), map1.get(S.charAt(lt)) - 1);//맨 앞에 부분 뺴줌
      if (map1.get(S.charAt(lt)) == 0) {
        map1.remove(S.charAt(lt));
      }
      lt++;


    }
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}