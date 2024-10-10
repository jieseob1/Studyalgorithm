class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long start = 1;
        long end = 1000000000 * 100000L;
        System.out.println(end);
        while(end > start) {
            long cnt = 0;
            long mid = (start + end) / 2;
            for(int time: times) {
                cnt += mid / time;
            }
            if(cnt >= n) { //cnt가 더 많다는건 mid값이 많다는 뜻
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        answer = start;
        return answer;
    }
}