import java.util.*;

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {1,5,6,10};
        int result = solution.solution(A);
        System.out.println("Result: " + result);
    }
}

class Solution {

    public int solution(int[] A) {
        int count = 0 ;
        int idx = 1;

        while (true) {
            if (idx >= A.length) {
                break;
            }

           if (A[idx] <= A[idx - 1]) { // 이전게 더 크면, 4 2
                //그럼 여기서 시작
               count++;
               if (idx + 1 < A.length) {
                   // 다음거가 더 작으면, 4 2 1
                   idx++;
               }
               System.out.println("idx: " + idx + ", A[idx]: " + A[idx]);
               while (idx < A.length && A[idx] >= A[idx - 1]) { // 다음거보
                   idx++;
               }

            } else {
                idx++;
            }

        }
        return count;
    }


}