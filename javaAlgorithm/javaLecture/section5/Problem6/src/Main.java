import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String input = st.nextToken();
    //()(((()())(())()))(())
    Stack<Character> stack = new Stack<>();
    int cnt = 0;
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '(') {
        stack.push(input.charAt(i));
      } else if (input.charAt(i) == ')') {
        if (input.charAt(i - 1) == '(') { //레이저
          stack.pop();
          cnt += stack.size();
        } else if (input.charAt(i - 1) == ')') { //닫기
          stack.pop();
          cnt++;
        }
      }
    }
    System.out.println(cnt);
  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}