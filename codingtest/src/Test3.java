import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,5,6,10}));
    }

    // 가장 긴 배열 스위칭
    public static int solution(int[] A) {
        int n = A.length;
        int maxLen = 1;
        int start = 0;

        // 현재 윈도우의 짝수/홀수 위치에서의 숫자 카운트
        Map<Integer, Integer> evenCount = new HashMap<>();
        Map<Integer, Integer> oddCount = new HashMap<>();

        for (int end = 0; end < n; end++) {
            int rel = (end - start) % 2 == 0 ? 0 : 1;
            Map<Integer, Integer> currentMap = rel == 0 ? evenCount : oddCount;

            currentMap.put(A[end], currentMap.getOrDefault(A[end], 0) + 1);

            // 둘 중 하나라도 2개 이상의 값이 존재하면 안 됨 → 줄여야 함
            while (evenCount.size() > 1 || oddCount.size() > 1) {
                int relStart = 0;
                if (start % 2 == 0) {
                    relStart = 0;
                    evenCount.put(A[start], evenCount.get(A[start]) - 1);
                    if (evenCount.get(A[start]) == 0)
                        evenCount.remove(A[start]);
                } else {
                    relStart = 1;
                    oddCount.put(A[start], oddCount.get(A[start]) - 1);
                    if (oddCount.get(A[start]) == 0)
                        oddCount.remove(A[start]);
                }
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}
