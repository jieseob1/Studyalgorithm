package section1.string1_4;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * input
  3
 good
 Time
 Big
 */
public class Main {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
//            StringBuilder: string다룸

            //방법1
//            String tmp = new StringBuilder(s).reverse().toString(); // stringBuilder 객체를 다시 string화를 시켜야지 tmp에 들어가게 된다.
//            // String을 바꾸면 새로운 객체가 생성됨 => 자꾸 생성된다.
//            //string: immutable
//            //StringBuilder:mutable, 문자열 변경 가능, 문자열을 여러번 변경하는 상황에서 StringBuilder가 유리하다. => 객체 한번만 만들면 끝.
//            answer.add(tmp); //arraylist 추가 add
            char[] ch = s.toCharArray(); //단어를 가지는 string이 변경된다.
            // length /2 번만 하면 된다. lt,rt
            int lt = 0, rt = ch.length - 1; // 직접 바꿔주는 것
            while (lt < rt) {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(ch); //이것은 객체 접근이 아닌, 클래스 접근이다.
            answer.add(tmp);

        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); //int로 숫자 받는다.
        String[] str = new String[n]; //n개 동적 배열
        for (int i = 0; i < n; i++) { // for 문 n개 단어 str배열에 하나씩 넣는다.
            str[i] = kb.next(); //다음줄을 받겠다.
        }

        for (String x : T.solution(n,str)) { // iter Arraylist를 받는다.
            System.out.println(x);
        }
    }
}
