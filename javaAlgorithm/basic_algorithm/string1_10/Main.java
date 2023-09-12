package basic_algorithm.string1_10;

import java.util.Scanner;

//g0en2T0s8eSoft
public class Main {
    public int[] solution(String s, char ch) {
        int[] answer = new int[s.length()]; //s의 길이만큼 int배열 동적으로 잡음
        int p = 1000;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ch) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ch) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i],p); //기존값과 p 중에서
            }
        }
        return answer;
    }
    public static void main(String[] args){
//        스태틱에서 인스턴스 메소드 호출하려면 클래스 객체 만들어줘야 함
        Main T = new Main();
        Scanner kb=new Scanner(System.in);
        String s =kb.next(); //문자열을 하나 읽어들인다.
        char ch = kb.next().charAt(0); //0번째에 있는 char를 가지고 온다. => 글자를 넣을때는 이런식으로 넣어주면 된다.
        System.out.print(T.solution(s,ch));
    }
}