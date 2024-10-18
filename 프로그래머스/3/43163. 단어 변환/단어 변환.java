class Solution {
    static int min = Integer.MAX_VALUE;
    public int solution(String begin, String target, String[] words) {
        //한 번에 한개의 알파벳만 바꿀 수 있음 words에 있는 단어로만
        //dfs로 풀어야 되지 않나 => 방문 한거는 안되는 걸로 하고 갔다 오면 풀어주는 걸로
        
        int answer = 0;
        // boolean flag = false;
        // for(String word : words) {
        //     if(word.equals(target)) {
        //         flag = true;
        //     }
        // }
        // if (flag) {
        //     return 0;
        // }
        boolean[] visited = new boolean[words.length];
        dfs(words, visited, begin, target,0);
        System.out.println(min);
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
    
    private void dfs(String[] words, boolean[] visited, String begin, String target, int depth) {
        if(begin.equals(target)) {
            min = Math.min(min,depth);
        } else {
            for(int i = 0 ; i < words.length; i++) {
                if(visited[i] || !isOnlyOneCharacterChange(begin, words[i])) continue;
                
                visited[i] = true; //추가적으로 여기서 단어 한개만 바뀐게 맞는지에 대해서 확인이 추가로 들어가야 될듯
                dfs(words, visited, words[i], target,depth + 1);
                visited[i] = false;
            }
        }
    }
    
    private boolean isOnlyOneCharacterChange(String origin, String destination) {
        int cnt = 0;
        char[] originChar = origin.toCharArray();
        char[] destChar = destination.toCharArray();
        for(int i = 0 ; i < originChar.length;i++) {
            if(originChar[i] != destChar[i]) {
                cnt++;
            }
        }
        if(cnt > 1) return false;
        return cnt == 1;
    }
}