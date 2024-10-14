class Solution {
    //solution: 재귀를 통해서 각각의 노드가 모든 노드의 수에 도달할 수 있다면 해당 정보는 순위를 알 수 있다.
    public int solution(int n, int[][] results) {
        int answer = 0;
        boolean[][] adjArray = new boolean[n][n];
        createAdjacantArray(adjArray, results);
        for(boolean [] arr: adjArray) {
            for(boolean element: arr) {
                System.out.print(element +" ");
            }
            System.out.println();
        }
        for( int i = 0; i < n ; i++) {
            boolean[] isVisited = new boolean [n];
            int winner = countWinner(adjArray, isVisited, i) -1;
            int loser = countLoser(adjArray, isVisited, i) -1;
            System.out.println("winner => " + winner + " Loser => " + loser);
            if(isRankAckknowledgable(winner,loser, n)) {
                answer += 1;
            }
        }
        // 앞과 뒤를 돌면서 count 확인
        return answer;
    }
    private boolean isRankAckknowledgable(int winner, int loser, int n) {
        if((winner+loser+1) == n) return true;
        return false;
    }
    private void createAdjacantArray(boolean[][] arr,int[][] results) {
        for(int[] result: results) {
            int winner = result[0] -1;
            int loser = result[1] -1;
            arr[winner][loser] = true;
        }
    }
    
    private static int countWinner(boolean[][] arr, boolean[] isVisited, int u) {
        int cnt = 1;
        for( int v = 0 ;v < arr[u].length; v++) {
            if(!arr[u][v] || isVisited[v]) continue;
            isVisited[v] = true;
            cnt += countWinner(arr,isVisited,v);
        }
        return cnt;
    }
    private static int countLoser(boolean[][] arr, boolean[] isVisited, int u) {
        int cnt = 1;
        for( int v = 0 ;v < arr[u].length; v++) {
            if(!arr[v][u] || isVisited[v]) continue;
            isVisited[v] = true;
            cnt += countLoser(arr,isVisited,v);
        }
        return cnt;
    }
}