import java.util.*;

class Solution {
    //1.재귀 방식 => 함수 만들어서 하는 방법
    //2. 순차 누적 방식 => 아래와 같은 방법
    public int solution(int n) {
        int answer = 0;
        int[] mem = new int[n+1];
        Arrays.fill(mem,-1);
        mem[0] = 0;
        mem[1] = 1;
        for(int i = 2; i <= n; i++) {
            mem[i] = (mem[i-1] + mem[i-2]) % 1234567;
        }
        return mem[n];
    }
}