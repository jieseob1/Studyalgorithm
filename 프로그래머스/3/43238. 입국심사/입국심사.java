import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long left = 1;
        long right = n * (long) Arrays.stream(times).max().getAsInt();
        while(left < right) { // 나중에 같아 지는 거 대비하기 위해서 등호 뺌
            long mid = (left + right) / 2;
            // System.out.println("mid => " + mid);
            // System.out.println("left => " + left);
            // System.out.println("right => " + right);
            if (count(times, mid) >= n) { //count가 더 크면 줄여야 한다.
                right = mid;
            }  else {
                left = mid + 1; 
            }
        }
        //이렇게 하면 안될거 같은데, 기준을 좀 알아야 될듯
        System.out.println("left => " + left);
        System.out.println("right => " + right);
        return left;
    }
    
    private static long count(int[] times, long mid) {
        long cnt = 0;
        for(int time : times) {
            cnt += mid / time;
        }
        return cnt;
    }
}