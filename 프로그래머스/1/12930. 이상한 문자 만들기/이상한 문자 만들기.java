class Solution {
    public String solution(String s) {
        int idx = 0;
        boolean isUpper = true;
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(!Character.isAlphabetic(ch)) {
                sb.append(ch);
                isUpper =true;
            }
            else {
                if (isUpper) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
                isUpper = !isUpper;
            }
        }
        return sb.toString();
    }
}