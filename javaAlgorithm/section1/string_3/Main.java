package section1.string_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer ="";
        int m = Integer.MIN_VALUE; // 최대값으로 계속 갱신할거임
        String[] splitStr;
        splitStr = str.split(" ");
        for (String s : splitStr) {
            int len = s.length();
            if (len > m) {
                m = len;
                answer = s;
            }
        }





        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
