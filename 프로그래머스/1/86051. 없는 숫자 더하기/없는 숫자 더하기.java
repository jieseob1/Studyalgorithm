import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    private static List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> newNum = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        for(int ele : arr) {
            if(!newNum.contains(ele)) {
                answer += ele;
            }
        }
        System.out.println(answer);
        return answer;
    }
}