class Solution {
    static int cnt = 0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(0,numbers[0],numbers,target);
        dfs(0,-numbers[0],numbers,target);
        answer = cnt;
        return answer;
    }
    private void dfs(int v, int sum,int[] numbers, int target) {
        if (v == numbers.length-1) {
            if (sum == target) {
                cnt++;
            }
        } else {
            dfs(v+1, sum+numbers[v+1], numbers, target);
            dfs(v+1, sum-numbers[v+1], numbers, target);
        }
    }
}