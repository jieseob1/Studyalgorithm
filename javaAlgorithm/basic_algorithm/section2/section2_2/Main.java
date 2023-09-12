package basic_algorithm.section2.section2_2;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//보이는 학생
    public int solution(int n, int[] arr) {
        int answer = 1, max = arr[0];

        for (int i = 1; i < n; i++) {
            if(arr[i] >max) {
                answer++;
                max = arr[i]; // just tmp logic
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        걍 int array 형태로 만듬

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}
