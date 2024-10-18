class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int len = computers.length;
        boolean[] visited = new boolean[len];
        for(int i = 0; i < len; i++) {
            if(visited[i]) continue;
            dfs(i, computers, visited);
            answer++;
        }
        return answer;
    }
    private void dfs(int computer, int[][] computers, boolean[] visited) {
        visited[computer] = true;
        for(int i = 0 ; i < computers.length ; i++) {
            if(computers[computer][i] == 1 && !visited[i]) { //여기에 이렇게 조건을 넣어서 통과한 경우에만 다음 노드에 대해서 dfs를 돌게 된다.
                dfs(i, computers, visited);   
            }
        }        
    }
}