import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean flag = true;
        boolean answer = true;
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        for(char ch: chars) {
            if(ch == '(') {
                stack.push(ch);
            } else {
                if(stack.size() == 0) {
                    flag = false;
                }
                if(stack.size() != 0) {
                    stack.pop();
                }
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        answer = (stack.size() == 0 && flag) ? true : false;
        return answer;
    }
}