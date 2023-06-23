package section1.string_1;

import java.util.Scanner;

public class Main {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
//        for(int i = 0; i < str.length(); i++) {
//             //string을 index로 접근하는 방식은 charAt이다.
//            if (str.charAt(i) == t) {
//                answer++;
//            }
//        }
        for (char x : str.toCharArray()) { //오른쪽은 배열 or collectionFramework 따라서 str을 배열로 만들어줘야함
            if (t == x) {
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args){
//        스태틱에서 인스턴스 메소드 호출하려면 클래스 객체 만들어줘야 함
        Main T = new Main();
        Scanner kb=new Scanner(System.in);
        String str =kb.next(); //문자열을 하나 읽어들인다.
        char c = kb.next().charAt(0); //string을 index로 접근

        System.out.print(T.solution(str,c));
    }
}