import java.util.*;

class Solution {
    static int[] res = new int[11];
    static int[] lion = {-1};
    static int max = 0;
    public int[] solution(int n, int[] info) {
        dfs(0,n,info);
        
        return lion;
    }
    private void dfs(int depth,int n,int[] info) { //여기서 백트래킹으로 처리할 예정
        if(depth == n) {            
            int diff = count(info);
            if(max <= diff) {
                max = diff;
                lion = Arrays.copyOf(res,11);
            }
            return;
        } else {
            for(int i = 0; i < 11 && (res[i] <= info[i]);i++) {
                // if(res[i] > info[i]) continue;
                res[i] += 1;
                dfs(depth+1, n,info);
                res[i] -= 1;
            }
        }
    }
    
    private int count(int[] info) { // 어피치와 라이언과의 점수 차이를 나타낸다.
      // info와 lion을 비교하면서 값의 차이를 보여준다.
        int apeach = 0;
        int lionCnt = 0;
        for(int i = 0; i < 11; i++) {
            if(info[i] == 0 && res[i] == 0) continue;
            if(info[i]  >= res[i]) { // 어피치가 더 크거나 같은 경우
                apeach += 10-i;
            } else {
                lionCnt += 10-i;
            }
        }
        int diff = lionCnt - apeach;
        if(diff<=0) return -1;

        return diff;
    }
}