class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for(char ch: chars) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                char popChar;
                if(stack.size() == 0) {
                    return false;
                }
                popChar = (char) stack.pop();
                System.out.println("popChar => " + popChar);
                if(popChar == '(' && ch != ')') {
                    return false;
                } else if (popChar == '{' && ch != '}') {
                    return false;
                } else if (popChar == '[' && ch != ']') {
                    return false;
                }
            }
        }
        if(stack.size() > 0) {
            return false;
        }
        return true;
    }
}