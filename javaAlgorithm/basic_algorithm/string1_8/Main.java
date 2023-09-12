package basic_algorithm.string1_8;


import java.util.Scanner;

// input: a#b!GE*T@S
//output: S#T!EG*b@a
public class Main {
    //유효한 팰린드롬

    public String solution(String str) { //알파벳으로만 비교해야한다. => :, 이런 것들을 없애줘야 한다.
        String answer = "YES";
        str = str.toUpperCase().replaceAll("[^A-Z]",""); //대문자 A부터 Z까지가 아니면 => ^는 부정
//                for(int i =0 ;i < str.length() / 2;i++) {
//            if (str.charAt(i) != str.charAt(str.length() -1 -i)) {
//                answer = "NO";
//                break;
//            }
//        }
        String tmp = new StringBuilder(str).reverse().toString();
        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
