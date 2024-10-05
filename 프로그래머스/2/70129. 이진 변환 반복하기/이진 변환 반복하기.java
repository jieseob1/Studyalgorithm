class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int loop = 0;
        while(true) {
            if (s.equals("1")) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            for(char ch : s.toCharArray()) {
                if(ch == '0') {
                    cnt++;
                } else {
                    sb.append(ch);
                }
            }
            int len = sb.toString().length();
            String radix2Len = Integer.toString(len,2);
            s = radix2Len;
            loop++;
        }
        System.out.println("cnt => " + cnt);
        System.out.println("loop => " + loop);
        int[] answer = {loop, cnt};
        return answer;
    }
}