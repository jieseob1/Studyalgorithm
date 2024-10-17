import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        //스파크 -> 라이트닝 볼트 -> 썬더 => 선행 순서가 필요함
        // 해당 순서에 어긋나면 안된다.
        //skill은 26이하
        // skill_trees는 20 이하 배열
        List<String> list = new ArrayList();
        for(String skillTree : skill_trees) { //20
            StringBuilder sb = new StringBuilder();
            for(char ch : skillTree.toCharArray()) { //26
                for(char subStr: skill.toCharArray()) {
                    if(subStr == ch) {
                        sb.append(subStr);
                    }
                }
            }
            list.add(sb.toString());
        }
        for(String str: list) {
            if(skill.startsWith(str)) {
                answer++;
            }
        }
        return answer;
    }
}