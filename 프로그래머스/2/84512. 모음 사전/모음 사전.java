class Solution {
    public static int cnt = 0;
    public static int ans = 0;
    public static char[] alpha = {'A','E','I','O','U'};
    public int solution(String word) {
        int answer = 0;
        String str ="";
        dfs(str,word);
        return ans;
    }
    private void dfs(String str, String word) {
        if( str.length() > 5) {
            return;
        }
        System.out.println(str);
        
        if(str.equals(word)) {
            ans = cnt;
        }
        cnt++;
        
        for( int i = 0; i < alpha.length;i++) {
            dfs(str + alpha[i],word);
        }
    }
}