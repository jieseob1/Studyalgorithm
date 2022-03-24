n, m = map(int, input().split())
# n: 정점의 수 , m: 간선의 수
graph = [[0]*(n) for _ in range(n)]
for _ in range(m):
    a, b, c = map(int, input().split())  # a에서 b로 가는 비용은 c
    graph[a-1][b-1] = c  # 0,1부분에 7을 넣는다.
for i in range(n):
    print(graph[i])

# 그래프를 돌면서
