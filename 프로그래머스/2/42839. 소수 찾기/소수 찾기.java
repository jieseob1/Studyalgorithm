import java.util.*;
class Solution {
    static int cnt;
    static int[] visited;
    public int solution(String numbers) {
        Set<Integer> set = new HashSet();
        char[] stringifyNumbers = numbers.toCharArray();
        visited = new int[numbers.length()];
        //먼저 number를 쪼개서 만들 수 있는 모든 수들을 만들고, set에 넣음
        //돌면서 prime이면 cnt++
        for(int r = 1; r <= numbers.length();r++) {
            combination(stringifyNumbers,set,"",r);
        }
        for(Integer e: set) {
            if(isPrime(e)) {
                cnt++;
            }
        }
        return cnt;
    }
    private static void combination(char[] stringifyNumbers, Set<Integer> set,String str, int r) {
        if(str.length() == r) {
            set.add(Integer.parseInt(str));
        } else {
            for(int i = 0 ; i < stringifyNumbers.length; i++) {
                if(visited[i] == 0) {
                    visited[i] = 1;
                    combination(stringifyNumbers,set, str + stringifyNumbers[i],r);
                    visited[i] = 0;
                }
            }
        }
        
    }
    private static boolean isPrime(int n) {
        if(n <=1) return false;
        // if(n == 2 || n == 3) return true;
        for(int i = 2; i < n;i++) {
            if(n % i == 0 ) return false;
        }
        return true;
    }
}