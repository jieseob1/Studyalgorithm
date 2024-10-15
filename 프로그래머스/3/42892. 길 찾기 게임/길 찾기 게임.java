import java.util.*;
class Solution {
    //해당 문제 이진 트리 만드는 부분에 대해서 문제 확인함 => 추후에 다시 풀어볼 것
    public int[][] solution(int[][] nodeinfo) {
        // 이진 트리 생성할 것
        // 이진트리에 넣고 전위 순회, 후위 순회한 결과 2차원 배열에 담도록 할것
        int[][] answer = {};
        //이진 트리 생성 부분
        int len = nodeinfo.length;
        Node[] nodes = new Node[len];
        for( int i = 0; i < len; i++) {
            int x = nodeinfo[i][0];
            int y = nodeinfo[i][1];
            nodes[i] = new Node(i+1, x,y);
        }
        Arrays.sort(nodes, (s1,s2) -> s2.y - s1.y); // 노드 레벨에 따라 정렬
        Node root = constructTree(nodes);
        List<Integer> preList = new ArrayList();
        preOrder(root, preList);
        List<Integer> postList = new ArrayList();
        postOrder(root, postList);
        
        return new int[][] {
            preList.stream().mapToInt(Integer::intValue).toArray(),
            postList.stream().mapToInt(Integer::intValue).toArray()
        };
    }
    
    // 여기서 x,y에 대한 정보는 있지만, left node와 right 노드에 대한 정보는 없으므로 이에 대해서 넣어줄 것이다. 그리고 여기서는 그에 대한 insert 해주는 기능을 한다. 
    private Node constructTree(Node[] nodes) { //루트 노드를 기반으로 해서 nodes 정보를 받아서 left,right 노드에 대한 정보를 넣어준다.
        Node root = nodes[0];
        for(int i = 1 ; i < nodes.length;i++) {
            insert(nodes[i],root);
        }
        return root;
    }
    private void insert(Node node, Node root) {
        //왼쪽
        if(root.x > node.x) {
            if(root.left == null) {
                root.left = node;
            } else { //존재 한다면 더 아래 쪽으로
                insert(node, root.left);
            }
        } else { //오른쪽 노드 관련
            if(root.right == null) {
                root.right = node;
            } else {
                insert(node, root.right);
            }   
        }
    }
    private void preOrder(Node node, List<Integer> visits) {
        if(node == null) return;
        
        visits.add(node.value);
        preOrder(node.left, visits);
        preOrder(node.right, visits);
    }
    private void postOrder(Node node, List<Integer> visits) {
        if(node == null) return;
        
        postOrder(node.left, visits);
        postOrder(node.right, visits);
        visits.add(node.value);
    }
    
}


class Node {
    public final int value;
    public final int x;
    public final int y;
    
    public Node(int value, int x, int y) {
        this.value = value;
        this.x = x;
        this.y = y;
    }
    public Node left;
    public Node right;
}