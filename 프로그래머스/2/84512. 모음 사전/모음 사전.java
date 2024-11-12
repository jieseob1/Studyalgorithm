class Solution {
    static char[] words = {'A','E','I','O','U'};
    static int cnt,result;
    public int solution(String word) {
        int answer = 0;
        dfs("",0,word);
        answer = result-1;
        return answer;
    }
    private static void dfs(String str, int length,String word) {
        if(length > 5) return;
        cnt++;
        if(str.equals(word)) {
            result = cnt;
            return;
        } else {
            for(int i = 0; i < 5; i++) {
                dfs(str + words[i], length+1, word);
            }
        }
    }
}