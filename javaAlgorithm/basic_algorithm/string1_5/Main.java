package basic_algorithm.string1_5;


import java.util.Scanner;

// input: a#b!GE*T@S
//output: S#T!EG*b@a
public class Main {

    public String solution(String str) {
        String answer = "";
        char[] newStr = str.toCharArray(); // Arraylist이런식으로 할 필요 없이 그냥 primitive 타입인 char를 써서 해당 부분 array인것만 선언해주면 된다.
        int lt = 0, rt = str.length() -1;
        while (lt < rt) {
            if (!Character.isAlphabetic(newStr[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(newStr[rt])) {
                rt--;
            }else {
                char tmp = newStr[lt];
                newStr[lt] = newStr[rt];
                newStr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(newStr); //valueof는 string화 시켜준다. => 왜 toString은 안되지?!?!
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
