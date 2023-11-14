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

  public static void main(String[] args) {
    Main tree = new Main();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(4);
    DFS(tree.root);
  }
  public static void DFS(Node root) {
    int L = 0;
    if (root.lt == null && root.rt == null) {
      System.out.println(L);
    } else {
      L++;
      DFS(root.lt);
      DFS(root.rt);
    }
  }
}