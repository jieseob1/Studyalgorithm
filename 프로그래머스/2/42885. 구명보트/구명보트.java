import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        // 그리디 
        int answer = 0;
        // 최대 2명까지고, 무게 제한이 있는 거다 보니까 투포인터로 사용하는게 맞다는 군
        int left = 0;
        int right = people.length - 1;
        int cnt = 0;
        Arrays.sort(people);
        while(left <= right) {
            if(people[left] + people[right] > limit) {
                cnt++;
                right--;
            } else {
                cnt++;
                right--;
                left++;
            }
        }
        answer = cnt;
        
        return answer;
    }
}