import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap();
        for(int num : numbers) {
            map.put(num,1);
        }
        for(int i = 0; i <= 9; i++) {
            if(map.getOrDefault(i,0) != 1) {
                answer += i;
            }
        }
        return answer;
    }
}