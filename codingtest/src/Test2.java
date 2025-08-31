import java.util.HashSet;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        int[] T = {0, 0, 1, 2};
        int[] A = {1,2};
        // 3 반환
        System.out.println(solution(T,A));
    }

    // 스킬을 배울때마다 선행되는 스킬을 배워야지 배울 수 있다.
    // 예를 들어 스킬1에 스킬 0이 필요햐고, 스킬 2에 스킬 1이 필요하고 스킬 3에 스킬 1이 필요하면, 스킬2를 배우려면 2,1,0 순으로 배워야 한다.
    // 해당 알고리즘은 뭐야? => 위상정렬
    public static int solution(int[] T, int[] A) {
        Set<Integer> skillSet = new HashSet<>();
        for (int skill : A) {
            while (skill != -1 && !skillSet.contains(skill)) {
                skillSet.add(skill);
                skill = T[skill];
            }
        }
        return skillSet.size();
    }
}
