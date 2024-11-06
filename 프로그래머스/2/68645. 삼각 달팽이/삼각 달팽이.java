import java.util.*;

class Solution {
    static int[] dx = {0,1,-1}; // 아래, 오른쪽, 대각선 왼쪽
    static int[] dy = {1,0,-1};
    
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int idx = 1;
        int d = 0;
        int x = 0, y = 0;
        while(true) {
            triangle[y][x] = idx++;
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx < 0 || nx >= n || ny < 0 || ny >= n || triangle[ny][nx] != 0) { //만약 벗어나게 된다면
                d = (d + 1) % 3; //변경 하고
                nx = x + dx[d];
                ny = y + dy[d];
                if(nx < 0 || nx >= n || ny < 0 || ny >= n || triangle[ny][nx] != 0) { //그럼에도 불구하고 만약 안된다면 끝
                    break;
                }
            }
            x = nx;
            y = ny;
        }
        List<Integer> list = new ArrayList();
        for(int i = 0; i < n; i++) {
            for(int j = 0 ; j <= i; j++) {
                list.add(triangle[i][j]);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}