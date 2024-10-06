import java.util.Set;
import java.util.TreeSet;
class Solution {
    public Set<Integer> solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new TreeSet();
        int len = numbers.length;
        for(int i = 0; i < len-1;i++) {
            for(int j = i+1; j < len ; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        return set;
    }
}