import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList();
        //i부터 j+1까지 자르고 정렬 => k번째 수 뽑음
        for(int[] command: commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            int[] subArray = Arrays.copyOfRange(array,i-1,j);
            Arrays.sort(subArray);
            answer.add(subArray[k-1]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}