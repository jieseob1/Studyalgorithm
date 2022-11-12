from collections import deque
    
n,m,v = map(int, input().split())
# n: node, v: 간선, v:starting point of vertex

graph =[[0] * (n+1) for _ in range(n+1)]
visited = [0] * (n+1)

for i in range(m):
    a,b = map(int, input().split())
    graph[a][b] = graph[b][a] = 1

def dfs(v): # v: current position
    visited[v] = 1
    print (v, end=' ') # 1~4까지 
    for i in range(1,n+1): # visited를 모두 방문하기 위함
        if (visited[i] == 0 and graph[v][i] == 1): # 인전합 곳을 찾는 행위였다 
            dfs(i)
print(dfs(v))


def bfs(v):
    queue = [v]
    visited[v] = 0
    while queue:
        vertex = queue.pop(0)
        print(vertex, end=' ')
        for i in range(1, n+1):
            if (visited[i] == 1 and graph[v][i] == 1): # 인전합 곳을 찾는 행위였다 
                queue.append(i)
                visited[i] = 0

dfs(v)
print(visited)
bfs(v)
# def bfs(v): # using queue or deque
# dfs => recursion,
# bfs  => queue