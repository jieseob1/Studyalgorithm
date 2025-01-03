class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack();
        int idx = 0; 
        while(idx < tokens.length) {
            if(isOperator(tokens[idx])) { 
                String rightOperend = stack.pop();
                String leftOperend = stack.pop();
                stack.push(String.valueOf(calculate(leftOperend,rightOperend, tokens[idx])));
            } else {
                stack.push(tokens[idx]);
            }
            idx++;
        }
        return Integer.parseInt(stack.pop());
    }
    public boolean isOperator(String str) {
        if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
            return true;
        }
        return false;
    }

    public int calculate(String leftOperend, String rightOperend, String operator) {
        int result = 0;
        if(operator.equals("+")) {
            result = Integer.parseInt(leftOperend) + Integer.parseInt(rightOperend);
        } else if(operator.equals("-")) {
            result = Integer.parseInt(leftOperend) - Integer.parseInt(rightOperend);
        } else if(operator.equals("*")) {
            result = Integer.parseInt(leftOperend) * Integer.parseInt(rightOperend);
        } else if(operator.equals("/")) {
            result = Integer.parseInt(leftOperend) / Integer.parseInt(rightOperend);
        }
        return result;
    }
}