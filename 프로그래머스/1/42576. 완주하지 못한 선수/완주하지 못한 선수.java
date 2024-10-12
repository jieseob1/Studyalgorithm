import java.util.*;
import java.util.Map.Entry;
class Solution {
    public String solution(String[] participants, String[] completions) {
        //참여자, 완주자 completion
        //참여자 정보를 hashmap에넣고 돌면서 0이 아닌 정보를 뽑아내면 끝 
        Map<String, Integer> map = new HashMap();
        for(String participant: participants) {
            map.put(participant, ((map.get(participant) == null) ? 0 : map.get(participant)) + 1);
        }
        for (String completion: completions) {
            map.put(completion, map.get(completion) - 1);
        }
        for(Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() != 0) {
                return entry.getKey();
            }
        }
        String answer = "";
        return answer;
    }
}