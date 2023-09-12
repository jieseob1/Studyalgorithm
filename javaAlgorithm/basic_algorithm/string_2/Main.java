package basic_algorithm.string_2;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";

        
        for (char x : str.toCharArray()) {
            if (Character.isUpperCase(x)) {
                answer += Character.toLowerCase(x);
            } else {
                answer += Character.toUpperCase(x);
            }
        }

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
