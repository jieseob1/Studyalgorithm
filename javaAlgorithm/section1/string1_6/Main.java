package section1.string1_6;


import java.util.Scanner;

// input: a#b!GE*T@S
//output: S#T!EG*b@a
public class Main {
    // 중복 문자 제거

    public String solution(String str) {
        String answer = "";
        // indexOf를 사용해볼 예정
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            //charAt => i번째 해당하는 character를 빼준다.
            //indexOf => 해당하는 부분의 index를 빼준다.
            if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
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
