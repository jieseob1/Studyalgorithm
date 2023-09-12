import java.io.*;
import java.util.*;

public class Main {
    private static int n;
    private static String[] arr;
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        arr = new String[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
        }

        for (int i = 0; i < n; i++) {
            if (checkVPS(arr[i])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    private static boolean checkVPS(String str) {
        int strLen = str.length();
        Stack<Character> stack = new Stack();
        int cnt = 0;
        for (int i = 0; i < strLen; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
                cnt++;
            } else {
                if (cnt < 0 || stack.isEmpty()) {
                    return false;
                }
                stack.pop();
                cnt--;
            }
        }
        if (cnt > 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}