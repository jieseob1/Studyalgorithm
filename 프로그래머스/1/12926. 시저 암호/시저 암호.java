class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(ch == ' ') {
                sb.append(ch);
            } else {
                int offset = Character.isUpperCase(ch) ? 'A': 'a';
                int newOffset = (ch - offset + n) % ('z' - 'a' + 1);
                sb.append((char) (newOffset + offset));   
            }
        }
        return sb.toString();
    }
}