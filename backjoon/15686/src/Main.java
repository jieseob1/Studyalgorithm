import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    static int minVal;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        minVal = Integer.MAX_VALUE;
        //n은 줄의 개수를 알려준다.
        int[][] arr = new int[n][n];
        createArr(n, br, arr);

        List<int[]> chickenList = new ArrayList<>();
        List<int[]> houseList = new ArrayList<>();
        // 1. 치킨집의 좌표를 모두 찾아서 리스트에 저장
        // 2. 집의 좌표를 모두 찾아서 리스트에 저장
        saveChickenAndHousePoint(n, arr, chickenList, houseList);
        // 3. 조합을 이용해 m개의 치킨집을 선택 => chickenList에서 조합으로 m개 선택
        calculateMinChickenDistance(chickenList, houseList, m, minVal);

        System.out.println(minVal);
        // 4. 각 집마다 가장 가까운 치킨집을 찾아서 거리를 더함
        // 5. 최소 거리를 갱신

    }

    private static void calculateMinChickenDistance(List<int[]> chickenList, List<int[]> houseList, int m, int minVal) {
        int chickenCount = chickenList.size(); //치킨집 개수
        boolean[] visited = new boolean[chickenCount]; // 이렇게 했을때 어떻게 방문이 되는건지를 알수가 있나?
        calculateCombination(chickenList, houseList, visited, 0, chickenCount, m, minVal);
    }

    // 이부분이 좀 이해가 안됨
    private static void calculateCombination(List<int[]> chickenList, List<int[]> houseList, boolean[] visited, int i, int chickenCount, int m, int minVal) {
        if (m == 0) {
            // 선택된 치킨집들로부터 각 집까지의 최소 거리 계산
            int totalDistance = 0;
            for (int[] house : houseList) {
                int houseX = house[0];
                int houseY = house[1];
                int minDistance = Integer.MAX_VALUE;
                for (int j = 0; j < chickenCount; j++) { // 치킨집 만큼 돌면서
                    if (visited[j]) { // 방문한 경우 => 특정 치킨집에서의 가장 가까운 거리 계산
                        int[] chicken = chickenList.get(j); // 해당 index를 꺼낸다.
                        int chickenX = chicken[0];
                        int chickenY = chicken[1];
                        int distance = calculateChickenDistance(houseX, houseY, chickenX, chickenY);
                        if (distance < minDistance) {
                            minDistance = distance;
                        }
                    }
                }
                totalDistance += minDistance;
            }
            renewMinVal(totalDistance);
            return;
        }

        if (i >= chickenCount) {
            return;
        }

        // 현재 치킨집을 선택하는 경우
        visited[i] = true;
        calculateCombination(chickenList, houseList, visited, i + 1, chickenCount, m - 1, minVal);

        // 현재 치킨집을 선택하지 않는 경우
        visited[i] = false;
        calculateCombination(chickenList, houseList, visited, i + 1, chickenCount, m, minVal);
    }

    private static int calculateChickenDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
    private static void renewMinVal(int totalDistance) {
        if (totalDistance < minVal) {
            minVal = totalDistance;
        }
    }

    private static void saveChickenAndHousePoint(int n, int[][] arr, List<int[]> chickenList, List<int[]> houseList) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 2) {
                    chickenList.add(new int[]{i, j});
                } else if (arr[i][j] == 1) {
                    houseList.add(new int[]{i, j});
                }
            }
        }
    }

    private static void createArr(int n, BufferedReader br, int[][] arr) throws IOException {
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}