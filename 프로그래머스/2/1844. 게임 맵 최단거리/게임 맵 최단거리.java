import java.util.*;
class Solution {
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public int solution(int[][] maps) {
        //최대한 빨리 도착 => bfs
        //5x5 크기 맵
        // 검은색 갈 수 없음 => 0으로 되어 있음
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        int answer = 0;
        answer= bfs(maps,visited);
        return answer;
    }
    private int bfs(int[][] maps, boolean[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {0,0,1});
        visited[0][0] = true;
        
        while(!q.isEmpty()) {
            //            
            int[] position = q.poll();    
            if(position[0] == (maps.length-1) && position[1] == (maps[0].length -1)) {
                return position[2];
            }
            for(int i = 0; i < 4; i++) { //상 하 좌우
                int nx = position[0] + dx[i];
                int ny = position[1] + dy[i];
                //접근 불가 조건
                
                if(nx >= maps.length || nx < 0 || ny >= maps[0].length || ny < 0 || visited[nx][ny] || maps[nx][ny] == 0) continue;
                visited[nx][ny] = true;
                q.add(new int[] {nx, ny, position[2] + 1});
            }
        }
        return -1;
        
        
    }
}
