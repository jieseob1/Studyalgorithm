package section1.boj.gamer;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// input: a#b!GE*T@S
//output: S#T!EG*b@a
public class Main_백준_16564 {
// 16564범 문제
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//캐릭터들 개수
        int K = Integer.parseInt(st.nextToken());//올릴 수 있는 레벨 총합
        int[] levels = new int[N];//캐릭터별 레벨 => n개만큼의 레벨을 받는다.
        for (int i = 0; i < N; i++) {
            levels[i] = Integer.parseInt(br.readLine());
        }//input
        Arrays.sort(levels);

        int result = 0;
        int left = levels[0];
        int right = levels[N - 1];
        while (left <= right) {
            int tmpK = K;
            int mid = (left + right) / 2;
            for (int level : levels) {
                if (mid - level > 0) {
                    tmpK -=(mid - level);
                }
            }
            if (tmpK > 0) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}

/**
 *import java.io.BufferedReader;
 * import java.io.IOException;
 * import java.io.InputStreamReader;
 * import java.util.Arrays;
 * import java.util.StringTokenizer;
 *
 * public class Main {
 *     public static void main(String[] args) throws IOException {
 *
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         StringTokenizer st = new StringTokenizer(br.readLine());
 *
 *         long min = Integer.MAX_VALUE;
 *         long max = Integer.MAX_VALUE;
 *         long result = 0;
 *
 *         int N = Integer.parseInt(st.nextToken());
 *         int K = Integer.parseInt(st.nextToken());
 *         int arr[] = new int[N];
 *
 *         for (int i = 0; i < N; i++) {
 *             arr[i] = Integer.parseInt(br.readLine());
 *            	//배열에서 가장 작은값 저장
 *             min = Math.min(min, arr[i]);
 *         }
 *
 *         while (min <= max) {
 *             long mid = (min + max) / 2;
 *             long sum = 0;
 *
 *             for (int i = 0; i < N; i++) {
 *                 if (mid >= arr[i]) {
 *                     sum += mid - arr[i];
 *                 }
 *             }
 *
 *             if (sum <= K) {
 *                 result = Math.max(result, mid);
 *                 min = mid + 1;
 *             } else {
 *                 max = mid - 1;
 *             }
 *         }
 *         System.out.println(result);
 *     }
 * }
 */
