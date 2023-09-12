package basic_algorithm.string1_11;

import java.util.Scanner;

//g0en2T0s8eSoft
public class Main {
    public String solution(String s) {
        String answer = ""; //추가적으로 s 뒤에 빈 문자열을 하나 더 추가하는 방식도 있다.
        int cnt = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i +1)) cnt++;
            else {
                //다른 경우
                answer += s.charAt(i);
                if(cnt > 1)  answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        if (cnt > 1) {
            answer += s.charAt(s.length() - 1);
            answer += String.valueOf(cnt);
        } else {
            answer += s.charAt(s.length() - 1);
        }

        return answer;
    }
    public static void main(String[] args){
//        스태틱에서 인스턴스 메소드 호출하려면 클래스 객체 만들어줘야 함
        Main T = new Main();
        Scanner kb=new Scanner(System.in);
        String s =kb.next(); //문자열을 하나 읽어들인다.
        System.out.print(T.solution(s));
    }
}