import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
//매출액의 종류

    public static int[] arr;
    public static ArrayList<Integer> solution() throws IOException {
        ArrayList<Integer> answer = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } // n개 문자열 투입
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k - 1; i++) { // k-1까지 채워준다.
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size()); //모두 다 채워졌을 때에 대한 answer
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }

        return answer;

    }



    public static void main(String[] args) throws IOException {
        Main.solution();
    }
}