class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        boolean isUpper = true;
        for(char ch : s.toCharArray()) {
            if (ch == ' ') {
                isUpper = true;
                sb.append(ch);
                continue;
            }
            if(isUpper) {
                sb.append(Character.toUpperCase(ch));
                isUpper = false;
            } else {
                sb.append(Character.toLowerCase(ch));
                isUpper = true;
            }
        }
        return sb.toString();
    }
}