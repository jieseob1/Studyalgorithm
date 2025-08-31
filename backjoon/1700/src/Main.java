import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int K;

    public static void main(String[] args) throws IOException {
        solution()
    }

    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 멀티탭의 갯수
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] multiTapSequence = new int[K];
        int[] multiTap = new int[N]; // 모두 0으로 세팅되어 있음
        for (int i = 0; i < K; i++) {
            multiTapSequence[i] = Integer.parseInt(st.nextToken());
        }


    }

    // 더 뒤에 있는 거나 아예 없는 정보를 찾아서 헤딩 멀티탭의 idx를 배출한다.
    private int checkFarDistanceOrNull(int[] multiTap, int[] multiTapSequence, int order) { //order는 순서
        int max = Integer.MIN_VALUE;
        int plugtoRemove = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            //각 멀티탭을 돌면서, 해당 정보가 order q이후에 multitapsequence에
            int tap = multiTap[i]; //탭 정보를 가지고 와서
            int distance = getDistance(tap, multiTapSequence, order);
            if (distance > max) {
                max = distance;
                plugtoRemove = i;
            }
        }

    }

    private static int getDistance(int tap, int[] multiTapSequence, int order) { //순서를 어떻게 넝ㅎ어야 될지
        //가장 멀거나, 아예없는 경우
        int seq = Integer.MIN_VALUE;
        for (int k = order; k < multiTapSequence.length; k++) {
            if (tap == multiTapSequence[k]) {
                seq =k - order;
                break;
            }
        }
        if (seq == Integer.MIN_VALUE) {
            seq =
        }
    }
}