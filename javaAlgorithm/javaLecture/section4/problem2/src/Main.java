import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    //Anagram 문제 => HashMap 사용
    public static HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

    public static String solution() throws IOException {
        String answer = "YES";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken();
        st = new StringTokenizer(br.readLine());
        String str2 = st.nextToken();

        for (char ch : str1.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) +1);
        }
        for (char ch : str2.toCharArray()) {
            if (!hashMap.containsKey(ch) || hashMap.get(ch) == 0) {
                return "NO";
            }
            hashMap.put(ch, hashMap.get(ch) - 1);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main.solution();
    }
}