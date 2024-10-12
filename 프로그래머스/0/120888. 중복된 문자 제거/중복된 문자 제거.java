import java.util.*;
class Solution {
    public String solution(String my_string) {
        Set<Character> set = new LinkedHashSet();
        for(char ch : my_string.toCharArray()) {
            set.add(ch);
        }
        
        String answer = "";
        answer = set.stream().collect(StringBuilder::new, StringBuilder::appendCodePoint,StringBuilder::append).toString();
        System.out.println(answer);
        // for(Character ch: set) {
        //     answer += ch;
        // }
        return answer;
    }
}