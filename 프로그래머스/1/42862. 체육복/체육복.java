import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Map<Integer, Integer> students = new HashMap<>();
        
        // 모든 학생을 1로 초기화
        for (int i = 1; i <= n; i++) {
            students.put(i, 1);
        }
        
        // 여벌 체육복이 있는 학생 처리
        for (int r : reserve) {
            students.put(r, students.get(r) + 1);
        }
        
        // 도난당한 학생 처리
        for (int l : lost) {
            students.put(l, students.get(l) - 1);
        }
        
        // 체육복 빌려주기
        for (int i = 1; i <= n; i++) {
            if (students.get(i) == 0) {
                if (i > 1 && students.get(i-1) > 1) {
                    students.put(i-1, students.get(i-1) - 1);
                    students.put(i, 1);
                } else if (i < n && students.get(i+1) > 1) {
                    students.put(i+1, students.get(i+1) - 1);
                    students.put(i, 1);
                }
            }
        }
        
        // 체육 수업을 들을 수 있는 학생 수 계산
        return (int) students.values().stream().filter(v -> v > 0).count();
    }
}