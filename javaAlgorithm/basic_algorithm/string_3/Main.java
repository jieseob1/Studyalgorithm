package basic_algorithm.string_3;

import java.util.Scanner;

public class Main {
    //        1.split으로 처리하는 방법
//        2. indexOf로 처리하는 방법
//        2-2. subStr으로 처리하는 방법
    public String solution(String str) {
        String answer ="";
        int m = Integer.MIN_VALUE,pos; // 최대값으로 계속 갱신할거임
//        String[] splitStr;
//        splitStr = str.split(" ");

//        for (String s : splitStr) {
//            int len = s.length();
//            if (len > m) {
//                m = len;
//                answer = s;
//            }
//        }
        //띄어쓰기의 위치를 return
        while((pos = str.indexOf(' ')) != -1) { //-1이면 멈춘다.
            String tmp = str.substring(0, pos); //pos전까지 => 처음에는 it이 된다.
            int len = tmp.length();
            if(len > m) {//같다라고 하면 안된다.
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1); // 계속 잘라내는 중
        }
        if(str.length() > m) answer = str;

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
