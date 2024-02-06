import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

class Castle {
  int num;
  int height;

  public Castle(int num, int height) {
    this.num = num;
    this.height = height;
  }
}
public class Main {
  static int n;
  public static void solution() throws IOException {
    Stack<Castle> stack = new Stack<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      //1. stack이 비어있으면 그냥 stack에다가 넣는다.
      //2. stack이 비어있지 않으면
      int height = Integer.parseInt(st.nextToken());
      while(true){

        if (stack.isEmpty()) {
          stack.push(new Castle(i + 1, height));
          System.out.print("0 ");
        } else {
          System.out.println("check stack"+ stack.peek().height);
          if (stack.peek().height < height) { // 6 ,9 인 경우
            stack.pop();
          } else {
            System.out.print(stack.peek().num+" ");
            stack.push(new Castle(i + 1, height));
            break;
          }
        }
      }
    }


  }
  public static void main(String[] args) throws IOException {
    Main.solution();
  }
}