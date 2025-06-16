class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for(char ch: s.toCharArray()) {
            if(Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        String newString = sb.toString();
        int left = 0;
        int right = newString.length() -1;
        char[] charList = newString.toCharArray();
        while(left <= right) {
            if(charList[left] != charList[right]) {
                return false;
            } else {
                left++;
                right--;
            }
            
        }
        return true;
    }
}