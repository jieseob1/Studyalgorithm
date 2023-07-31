package section1.boj.multiply;


import java.util.Scanner;
public class Main {

    public int solution(int a, int b, int c) {
        int answer = 0;
        answer = (int) (Math.pow(a, b) % c);
        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        System.out.println(T.solution(a,b,c));
    }
}
