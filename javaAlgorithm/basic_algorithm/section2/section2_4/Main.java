package basic_algorithm.section2.section2_4;


import java.util.Scanner;

public class Main {
//보이는 학생
    public String solution(int n) {
        String answer = "";
        // 1:가위, 2:바위, 3: 보

        for (int i = 1; i < n; i++) {
            if (i == 1 || i == 2) {
                answer += "1 "
            } else {
                answer
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        걍 int array 형태로 만듬

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(T.solution(n));
    }
}
