package basic_algorithm.section2.section2_3;


import java.util.Scanner;

public class Main {
//보이는 학생
    public String solution(int n, int[] a,int[] b) {
        String answer = "";
        // 1:가위, 2:바위, 3: 보

        for (int i = 0; i < n; i++) {
            if(a[i] == b[i]) answer += "D";
            else if (a[i] == 1 && b[i] == 3) answer += "A";
            else if (a[i] == 2 && b[i] == 1) answer += "A";
            else if (a[i] == 3 && b[i] == 2) answer += "A";
            else answer += "B";
        }
        return answer;
    }

    public static void main(String[] args) {
//        걍 int array 형태로 만듬

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,a,b));
    }
}
