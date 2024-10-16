import java.util.*;
class Solution {
    private static class Node { //여기서 union-find 구현해야 함
        int depth = 1;
        Node parent = null;
    
        public boolean isConnected(Node o) {
            return o.root() == root();
        }
    
        public void merge(Node o) {
            if (isConnected(o)) return;
            Node root1 = o.root();
            Node root2 = root();
        
            if(root1.depth > root2.depth) {
                root2.parent = root1;
            } else if (root2.depth > root1.depth) {
                root1.parent = root2;
            } else {
                root2.parent = root1; //level이 같으면 같은 위치에 편입
                root1.depth +=1;
            }
        }
    
        public Node root() {
            if (parent == null) return this; //parent가 없으면 루트임
            return parent.root();
        }
    }
    //최소 신장 스패닝 트리 - 크루스칼 
    // 1. union-find 구현
    // 2. kruskal 구현 - 간선의 코스트가 낮은걸로 정렬 후 돌면서 union find 수행하면서 total cost 합침
    public int solution(int n, int[][] costs) {
        int answer = 0;
        //1.cost만큼 Edge 생성
        //2.cost에 따라서 sort진행 => 여러 방법 존재할 거 같은데, 1. edge 클래스 자체 comparable, arrays.sort하는 방법, priortiyQueue에 넣는 방법  => 일단 제일 쉽게 PriortiyQueue에 넣고 나머지 방법도 구현해보자
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>((a,b) -> a.cost - b.cost);
        for(int[] edge : costs) {
            pq.add(new Edge(edge[0],edge[1],edge[2]));
        }
        //노드 생성
        Node[] nodes = new Node[n];
        for(int i = 0 ; i < n; i++) {
            nodes[i] = new Node();
        }
        //3.edge 순회하면서 node 꺼내서 각각의 노드 마다 연결된거 확인하고 만약 연결 안되어 있으면, merge 진행하고 totalcost 업
        int totalCost = 0;
        while(!pq.isEmpty()) {
            Edge edge = pq.poll();
            int u = edge.u;
            int v = edge.v;
            int cost = edge.cost;
            Node node1 = nodes[u];
            Node node2 = nodes[v];
            if (node1.isConnected(node2)) continue; //연결 되어 있으면 그냥 지나침
            node1.merge(node2);
            totalCost += cost;
        }
        return totalCost;
    }
}

class Edge { //간선 정보
    public final int u;
    public final int v;
    public final int cost;
    
    public Edge(int u, int v, int cost) {
        this.u = u;
        this.v = v;
        this.cost = cost;
    }
}

