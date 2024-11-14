import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        //n을 k 진수로 바꿀 떄, 변환된 수 안에 아래 조건에 맞는 소수 몇개인지
         String[] tokens = Long.toString(n,k).split("0+"); //1개 이상
        for(String token : tokens) {
            if(isPrime(Long.parseLong(token))) {
                answer++;
            }
        }
        return answer;
    }
    private boolean isPrime(long n) {
        if(n <= 1) return false;
        for(long i = 2 ; i * i <= n ; i++) {
            if(n % i  == 0) return false;
        }
        return true;
    }
}