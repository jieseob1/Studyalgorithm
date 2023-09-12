package basic_algorithm.string1_7;


import java.util.Scanner;

// input: a#b!GE*T@S
//output: S#T!EG*b@a
public class Main {
    // 중복 문자 제거

    public String solution(String str) {
        String answer = "NO";
//        str = str.toLowerCase();
//        for(int i =0 ;i < str.length() / 2;i++) {
//            if (str.charAt(i) != str.charAt(str.length() -1 -i)) {
//                answer = "NO";
//                break;
//            }
//        }
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) { // equalsIgnoreCase
            answer = "YES";
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
