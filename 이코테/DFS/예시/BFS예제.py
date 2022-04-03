# 가까운 곳부터 탐색
# 큐 자료구조 사용
from collections import deque

def bfs(graph, start, visitied):
    queue = deque([start])  
    visitied[start] = True
    while queue: 
        temp_value = queue.popleft() 
        print(temp_value, end=' ')
        for i in graph[temp_value]:  
            if not visitied[i]:  
                queue.append(i) 
                visitied[i] = True
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
