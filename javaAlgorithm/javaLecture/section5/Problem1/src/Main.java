import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void solution() throws IOException {
        String ans = "YES";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Character> stack = new Stack<>();
        String str = st.nextToken();

        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.size() < 0 || stack.isEmpty()) {// 0보다 작아지거나
                    ans = "NO";
                    return;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            ans = "NO";
        }
        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        Main.solution();
    }
}