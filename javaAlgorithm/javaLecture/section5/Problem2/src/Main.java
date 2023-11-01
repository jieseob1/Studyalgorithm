import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

  public static void solution() throws IOException {
    String ans = "";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    String str = st.nextToken();
    Stack<Character> stack = new Stack<>();

    for (char ch : str.toCharArray()) {
      if (ch == ")") { // ) 해당 괄호가 나오게 된다면
        while (stack.pop() != '(') ; //( 괄호가 나오기 전까지 계속 뺀다.
      } else {
        stack.push(ch);
      }
    }
      for (int i = 0; i < stack.size(); i++) {
        ans += stack.get(i);
      }
      System.out.println(ans);
  }

  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}