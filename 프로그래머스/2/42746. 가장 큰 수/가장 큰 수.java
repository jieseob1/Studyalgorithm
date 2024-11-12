import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
    
        String[] strs = new String[numbers.length];
        
        for(int i = 0; i < numbers.length;i++) {
            strs[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(strs, (a,b) -> {
            return (b + a).compareTo(a + b);
        }); //nlogn
        if(strs[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
    return sb.toString();    
    }
    
}