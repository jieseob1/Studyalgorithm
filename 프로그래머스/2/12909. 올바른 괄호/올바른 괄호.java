import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        Stack<Character> stack = new Stack();
        for(Character ch : s.toCharArray()) {
            if(ch == '(') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) {
                    answer = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()) {
            answer = false;
        }
        return answer;
    }
}