import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        } //initialization
        
        // 양방향 그래프 생성
        for (int[] e : edge) {
            graph.get(e[0] - 1).add(e[1] - 1);
            graph.get(e[1] - 1).add(e[0] - 1);
        }
        return bfs(graph,n);
    }
    private int bfs(List<List<Integer>> graph, int n) {
        //거리 관련 리스트 생성
        Queue<Integer> queue = new LinkedList<>();
        int[] distances = new int[n];
        Arrays.fill(distances, -1);
        
        queue.offer(0); // 1번 노드(인덱스 0)부터 시작
        distances[0] = 0;
        int maxDistance = 0;
        
        while(!queue.isEmpty()) {
            int current = queue.poll();
            for(int neighbor: graph.get(current)) {//내부 리스트 있으므로 돈다
                if(distances[neighbor] == -1) {
                    queue.offer(neighbor);
                    distances[neighbor] = distances[current] + 1;
                    maxDistance = Math.max(maxDistance, distances[neighbor]);
                }
            }
        }
        for(int distance: distances) {
            System.out.print(distance + " ");
        }
        int count = 0;
        for (int distance : distances) {
            if (distance == maxDistance) {
                count++;
            }
        }
        
        return count;
    }
    
    
}