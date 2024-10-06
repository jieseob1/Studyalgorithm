import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(String numbers) {
        int answer = 0;
        Set<Integer> set = new HashSet();
        char[] chars = numbers.toCharArray(); //'1', '7'
        int len = chars.length;
        boolean[] isVisited = new boolean[len];
        for(int i = 1; i <= len;i++) {
            String str = "";
            permutation(chars,0,str, i,set, isVisited);
        }
        int cnt = 0;
        for (Integer num : set) {
            cnt++;
        }
        answer = cnt;
        return answer;
    }
    private void permutation(char[] chars, int depth, String str, int r,Set<Integer> set, boolean[] isVisited) {
        if ( depth == r) {
            int num = Integer.parseInt(str);
            if(isPrime(num)) {
                set.add(num);
            }
        } else {
            for( int i = 0 ; i < chars.length;i++) {
                if(isVisited[i]) continue;
                isVisited[i] = true;
                permutation(chars, depth+1, str + chars[i],r,set,isVisited);
                isVisited[i] = false;
            }
        }
    }
    private boolean isPrime(int num) {
        if (num < 2) return false; 
        if(num ==2 || num == 3) return true;
        for(int i = 2; i < num; i++) {
            if((num % i) == 0 ) return false; 
        }
        return true;
    }
}