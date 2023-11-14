import java.util.LinkedList;
import java.util.Queue;

class Node {
  int data;

  Node lt,rt; //이거였구나 lt, rt도 노드로 대변된다.

  public Node(int value) {
    this.data = value;
    lt = rt = null;
  }
}
public class Main {
  Node root; // Node 객체를 생성한다.

  public static void BFS(Node root) {
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);
    int L = 0;
    while (!queue.isEmpty()) {
      int len = queue.size(); // lvl에 따른 node 갯수
      System.out.print(L+" : "); //about level
      for (int i = 0; i < len; i++) {
        Node cur = queue.poll(); //current node
        System.out.print(cur.data+" "); // 현재 데이터 보여줌
        if (cur.lt != null) {
          queue.offer(cur.lt);
        }
        if (cur.rt != null) {
          queue.offer(cur.rt);
        }
      }
      L++;
    }
  }
  public static void main(String[] args) {
    Main tree = new Main(); // 새로운 main 클래스 생성
    tree.root = new Node(1); // main 내부에 있는 Node 클래스인 root를 생성하기 시작한다.
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    tree.root.rt.lt = new Node(6);
    tree.root.rt.rt = new Node(7);
    tree.BFS(tree.root);
  }
}