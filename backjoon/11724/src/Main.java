import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 정점
        int m = Integer.parseInt(st.nextToken()); // 간선
        List<Integer>[] list = new List[n + 1]; // 1 부터 n까지
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        // 정점간의 연결
        buildList(m, br, list);
        boolean[] visited = new boolean[n + 1];
        Arrays.fill(visited, false);

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (visited[i] == false) {
                dfs(list, visited, i);
                cnt++;
            }
        }
        System.out.println(cnt);

    }

    private static void dfs(List<Integer>[] list, boolean[] visited, int cur) {
        if (visited[cur] == false) { // 방문 안했으면 방문하는걸로 하고
            visited[cur] = true;
        }
        for (int next : list[cur]) {
            if (visited[next] == false) {
                dfs(list, visited, next);
            }
        }
        // i는 현재
    }

    private static void buildList(int m, BufferedReader br, List<Integer>[] list) throws IOException {
        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[start].add(end);
            list[end].add(start);
        }
    }
}