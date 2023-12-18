import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n,m ;
    static int[] combi;
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        combi = new int[n];
    }

    public static void DFS(int L, int s) {
        if (L == m) {
            for (int i : combi) {
                System.out.print(i+" ");
                System.out.println();
            }
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Main.solution();
    }
}