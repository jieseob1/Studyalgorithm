class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(Long.toString(n)).reverse();
        String str = sb.toString();
        int[] ans = new int[str.length()];
        for(int i = 0 ; i < str.length() ; i++) {
            ans[i] = (int) str.charAt(i) - '0';
        }
        return ans;
    }
}