### 아이디어
- bfs의 파라미터로는 `그래프, 시작 노드 ,방문 여부`가 들어가게 된다.
1. deque를 선언해주고 방문 여부를  참으로 해준다.
2. while문을 통해 queue가 빌때까지 계속 반복해준다.
3. popleft를 통해 제일 왼쪽에 있는 노드를 가지고 온다.
4. graph[currentNode]를 통해 for문을 돌면서 만약 방문을 안했다면 queue에 넣어주고 방문하였다고 한다.