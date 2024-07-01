import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class PersonScore implements Comparable<PersonScore> {
    private int firstTest;
    private int secondTest;

    public PersonScore(int firstTest, int secondTest) {
        this.firstTest = firstTest;
        this.secondTest = secondTest;
    }

    public int getFirstTest() {
        return firstTest;
    }


    public int getSecondTest() {
        return secondTest;
    }

    @Override
    public int compareTo(PersonScore o) {
        if (this.firstTest == o.firstTest) {
            return this.secondTest - o.secondTest;
        }
        return this.firstTest - o.firstTest;
    }


}

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(st.nextToken());
        for (int k = 0; k < T; k++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            List<PersonScore> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int firstTest = Integer.parseInt(st.nextToken());
                int secondTest = Integer.parseInt(st.nextToken());
                list.add(new PersonScore(firstTest, secondTest));
            }
            Collections.sort(list);

            int cnt = 1;
            int currentThreshold = list.get(0).getSecondTest();
            for (int j = 1; j < n; j++) {
                if (list.get(j).getSecondTest() < currentThreshold) {
                    cnt++;
                    currentThreshold = list.get(j).getSecondTest();
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        Main.solution();
    }
}