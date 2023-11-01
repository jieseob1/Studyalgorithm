import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int ans = 0;
    String str = st.nextToken();
    Stack<Integer> stack = new Stack<>();

    for (char c : str.toCharArray()) {
      if (Character.isDigit(c)) { // 알파벳
        stack.push(c -48); // int c 는 아스키코드
      } else {
        int right = stack.pop();
        int left = stack.pop();
        int temp = 0;
        if (c == '*'){
          temp = left * right;
        } else if (c == '/') {
          temp = left / right;
        } else if (c == '+') {
          temp = left + right;
        } else if (c == '-') {
          temp = left - right;
        }
        stack.push(temp);
      }
    }
    System.out.println(stack.pop());
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}