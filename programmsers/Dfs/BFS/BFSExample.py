# 큐 자료구조 사용
# 탐색 시작 노드 큐에 삽입 & 방문처리
# 큐에서 노드를 꺼내 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입 하고 방문 처리 한다.

from collections import deque


def bfs(graph, start, visited):
    queue = deque([start])  # 시작노드를 queue에 삽입하고 방문처리 한다
    visited[start] = True
    while queue:  # 큐가 빌때까지 진행
        v = queue.popleft()  # 큐에서 1을 꺼내고 방문안한 인접 노드 2,3,8을 모두 큐에 삽입후 방문처리\
        # 큐에서 노드 2를 꺼내고 방문하지 않은 인접 노드 7을 큐에 삽입후 방문 처리
        # 노드 3을 꺼내고 방문핮 ㅣ않은 인접 노드 4,5를 모두 큐에 삽입후 방문 처리
        # 노드 8을 꺼내고 방문하지 않은 인접 노드가 없으므로 무시
        # 7을 꺼내고 방문하지 않은 인접 노드 6을 큐에 삽입 후 방문 처리
        print(v, end=' ')  # 1 2 3 8 7  4 5 6
        for i in graph[v]:  # 2,3,8 로 가고
            if not visited[i]:  # visited[2],visited[3],visited[8]
                queue.append(i)
                visited[i] = True


graph = [
    [],
    [2, 3, 8],
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7]
]

visited = [False] * 9
bfs(graph, 1, visited)
