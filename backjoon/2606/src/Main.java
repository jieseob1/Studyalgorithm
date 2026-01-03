import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        while (k-- > 0) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            List<Integer>[] list = new ArrayList[v + 1]; // 이렇게 하는군 => 인접 리스트랑 인접 배열의 차이 => 메모리 차이가 있을듯
            for (int i = 1; i <= v; i++) list[i] = new ArrayList<>();
            for (int i = 0; i < e; i++) { // 간선을 돌면서
                st = new StringTokenizer(br.readLine());
                int startNode = Integer.parseInt(st.nextToken());
                int endNode = Integer.parseInt(st.nextToken());
                list[startNode].add(endNode);
                list[endNode].add(startNode);
            }
            int[] color = new int[v + 1];
            Arrays.fill(color, -1);
            bfs(v,color,list);
        }
    }

    private static void bfs(int v, int[] color, List<Integer>[] list) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        boolean ok = true;
        for (int start = 1; start <= v && ok; start++) {
            if (color[start] != -1) continue; //이미 처리된 컴포넌트
            color[start] = 0;
            queue.add(start);

            while (!queue.isEmpty() && ok) {
                int cur = queue.poll(); // 현재꺼를 꺼낸다.
                for (int nxt : list[cur]) { // 이중 리스트에 연결된 정보들을 꺼내서
                    if (color[nxt] == -1) { // -1이면 색깔을 칠해준다.
                        color[nxt] = 1 - color[cur];
                        queue.add(nxt);
                    } else if (color[nxt] == color[cur]) {
                        ok = false;
                    }
                }
            }

        }
        System.out.println(ok ? "YES" : "NO");

    }
}