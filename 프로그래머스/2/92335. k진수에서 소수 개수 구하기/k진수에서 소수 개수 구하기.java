class Solution {
    public int solution(int n, int k) {
        int answer = -1;
        //n을 k 진수로 바꿀 떄, 변환된 수 안에 아래 조건에 맞는 소수 몇개인지
         String[] tokens = Long.toString(n,k).split("0+");
        for(String token : tokens) {
            System.out.println("token => " + token);
        }
        return answer;
    }
}