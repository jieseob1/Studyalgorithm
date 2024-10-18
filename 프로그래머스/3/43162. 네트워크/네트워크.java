class Solution {
    static int[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new int[n];//0으로 처음 상태는 모두 false
        
        for(int i =0; i < n;i++) {
            if(visited[i] == 0) { //방문 안했다면
                answer++;
                DFS(i,n,computers);
                
                
            }
        }
        return answer;
    }
    
    public static void DFS(int v, int n, int[][] computers) {
        visited[v] = 1; //방문 표시 해주고
        for(int j =0; j < n;j++) {
            if(visited[j] == 0 && computers[v][j] ==1) {
                DFS(j, n, computers);
            }
        }
    }
}