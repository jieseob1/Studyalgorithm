class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        //yellow의 경우 x-2 * y-2 임
        ///brown의 경우 2 * x + 2* (y-2)임
        //1500번을 돌리면=> 22500000
        for(int i = 0; i < 2000; i++) { //x가 될 친구
            for(int j = 0 ; j < 2000; j++) {
                if(i >= j) {
                    if((i-2) * (j-2) == yellow && (2 * i + 2 * (j-2)) == brown) {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }   
                }
            }
        }
        return answer;
    }
}