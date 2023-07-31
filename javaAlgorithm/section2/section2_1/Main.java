package section1.string_1;

import java.util.Scanner;

public class Main {
    //    배열에다가 넣고 탐색하면 끝나는 문제
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }
    public static void main(String[] args){
//        스태틱에서 인스턴스 메소드 호출하려면 클래스 객체 만들어줘야 함
        Main T = new Main();
        Scanner kb=new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.println(x+ " ");
        }
    }
}