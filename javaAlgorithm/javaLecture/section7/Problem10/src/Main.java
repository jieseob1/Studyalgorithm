import java.util.LinkedList;
import java.util.Queue;

class Node {
  int data;
  Node lt,rt;

  public Node(int val) {
    data = val;
    lt = rt = null;
  }
}
public class Main {
  Node root;
  static int L;
  public static void main(String[] args) {
    Main tree = new Main();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    System.out.println(BFS(tree.root));

  }
  public static int BFS(Node root) {
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);
    L = 0;
    while (!queue.isEmpty()) { // 여기서 알아야 했던건 for문 안에서 모두 처리를 해줘야 한다는거
      int len = queue.size();
      for (int i = 0; i < len; i++) {
        Node cur = queue.poll(); //꺼냄
        if (cur.lt == null && cur.rt == null) {
          return L;
        }
        if (cur.lt != null) queue.offer(cur.lt);
        if (cur.rt != null) queue.offer(cur.rt);
      }
      L++;
    }
    return L;
  }
}