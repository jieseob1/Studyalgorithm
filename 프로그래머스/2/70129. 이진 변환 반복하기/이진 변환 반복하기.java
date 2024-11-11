class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int deleteZero = 0;
        int transition = 0;
        while(true) {
            StringBuilder sb = new StringBuilder();
            
            for(char ch : s.toCharArray()) {
                if(ch == '1') {
                    sb.append(ch);
                } else {
                    deleteZero++;
                }
            }
            int size = sb.toString().length();
            s = Integer.toString(size, 2);
            transition++;
            if(s.equals("1")) break;
        }
        return new int[]{transition, deleteZero};
    }
}