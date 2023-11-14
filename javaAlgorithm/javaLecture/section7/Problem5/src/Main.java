class Node {
  int data; // 노드를 의미함
  Node lt, rt; // 노드의 왼쪽, 오른쪽

  public Node(int val) {// 초기 init
    data = val;
    lt = rt = null;
  }
}

public class Main {
  //이진 트리 순회
  Node root; //여기다가 지금 저장중 => 객체의 주소를 저장하는 변수 즉, 참조형

  public void DFS(Node root) { // 노드의 root를 받는다.
    if (root == null) { // 말단 노드로 옴
      return;
    } else {
      System.out.print(root.data+" "); //전위 순회
      DFS(root.lt); //왼쪽으로
      System.out.println(root.data+" "); //중위 순회
      DFS(root.rt); // 오른쪽으로
    }
  }



  public static void main(String[] args) {
    Main tree = new Main();
    tree.root = new Node(1);
    tree.root.lt = new Node(2); // 새로운 객체를 생성
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    tree.root.rt.lt = new Node(6);
    tree.root.rt.rt = new Node(7);
    tree.DFS(tree.root); //1번 데이터 가지고 오는 root 노드

  }
}