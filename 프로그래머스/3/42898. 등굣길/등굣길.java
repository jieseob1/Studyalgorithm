import java.util.*;
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] mem = new int[n+1][m+1];
        for (int[] row : mem) {
            Arrays.fill(row, -1);
        }
        
        boolean[][] isPuddle = new boolean[n+1][m+1];
        for (int[] puddle : puddles) {
            isPuddle[puddle[1]][puddle[0]] = true;  // 주의: x와 y 좌표 순서 변경
        }
        
        return count(1,1,n,m,mem,isPuddle);
    }
    
    public int count(int x, int y, int n , int m, int[][] mem, boolean[][] isPuddle) {
        
        if(x > n || y > m) return 0;
        if(isPuddle[x][y]) return 0;
        if(mem[x][y] != -1) return mem[x][y];
        if( x == n && y == m) return 1;
        
        int total = count(x+1,y,n,m,mem,isPuddle) + count(x,y+1,n,m,mem,isPuddle);
        return mem[x][y] = total % 1000000007;
    }
}