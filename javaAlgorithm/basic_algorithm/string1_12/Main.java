package basic_algorithm.string1_12;

import java.util.Scanner;

public class Main {
    public String solution(int n, String s) {
        //substring으루 7개씩 끊어낸다
        String answer="";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace("*", "0");
            int num = Integer.parseInt(tmp, 2); //2진수로 넘어간다.
            answer += (char) num;
            s = s.substring(7);
        }
        return answer;
    }
    public static void main(String[] args){
//        스태틱에서 인스턴스 메소드 호출하려면 클래스 객체 만들어줘야 함
        Main T = new Main();
        Scanner kb=new Scanner(System.in);
        int n =kb.nextInt(); //문자열을 하나 읽어들인다.
        String str =kb.next(); //문자열을 하나 읽어들인다.
        char c = kb.next().charAt(0); //string을 index로 접근
        System.out.print(T.solution(n,str));
    }
}