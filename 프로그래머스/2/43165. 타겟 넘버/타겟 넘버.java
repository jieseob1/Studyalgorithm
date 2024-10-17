class Solution {
    static int cnt = 0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int sum = 0;
        dfs(numbers,0,sum, target);
        return cnt;
    }
    public void dfs(int[] numbers, int depth, int sum,int target) {
        if(numbers.length == depth) {
            if (sum == target) {
                cnt++;
            }
        } else {
            dfs(numbers, depth+1, sum + numbers[depth],target);
            dfs(numbers, depth+1, sum - numbers[depth],target);
        }
    }
}