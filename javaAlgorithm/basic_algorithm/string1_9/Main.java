package basic_algorithm.string1_9;

import java.util.Scanner;

//g0en2T0s8eSoft
public class Main {
    public int solution(String str) {
        int answer = 0;
        String tmp = "";
        char[] charArr;
//        charArr = str.toCharArray();
//        for (char c : charArr) {
//            if (!Character.isAlphabetic(c)) {
//                tmp += c;
//            }
//        }
        for (char x : str.toCharArray()) {
            if(x >= 48 && x<= 57) answer = answer*10+(x - 48);
        }
        answer = Integer.parseInt(tmp);
        return answer;
    }
    public static void main(String[] args){
//        스태틱에서 인스턴스 메소드 호출하려면 클래스 객체 만들어줘야 함
        Main T = new Main();
        Scanner kb=new Scanner(System.in);
        String str =kb.next(); //문자열을 하나 읽어들인다.

        System.out.print(T.solution(str));
    }
}