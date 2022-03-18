# 가까운 곳부터 탐색
# 큐 자료구조 사용
from collections import deque


def bfs(graph, start, visitied):
    # 큐 구현을 위해서 deque 라이브러리를 사용한다.
    # 1.제일 먼저 해야할일은 현재 노드의 방문 여부를 참으로 한다
    # 2.큐가 빌 때까지 계속 반복한다.
    # 2.1 큐에서 하나의 원소를 뽑아 출력하고, 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입하고, i번째 방문 여부를 참으로 한다.
    queue = deque([start])  # start 부분을 리스트에 넣고 deque로 만든다.
    visited[start] = True
    while queue:  # queue가 빌떄까지 반복한다.
        temp_value = queue.popleft()  # 왼쪽에서 값을 하나 꺼내서
        print(temp_value, end=' ')
        for i in graph[temp_value]:  # 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입한다.
            if not visited[i]:  # 방문하지 않았다면
                queue.append(i)  # queue에 i를 추가하고
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
    [1, 7],
]

visited = [False] * 9

bfs(graph, 1, visited)
