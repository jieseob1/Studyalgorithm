
def dfs(v):
    global cnt
    if v == n:  # n번 정점에 도착한 경우
        cnt += 1  # 도착을 할수 있는 경우이기 때문에 cnt를 1 증가시킨다.
    else:
        for i in range(1, n+1):  # 1번부터 n+1까지 돌아야한다. -> n가지로 가지가 뻗는 경우
            if graph[v][i] == 1 and ch[i] == 0:  # graph[v][i] ->v번째에서  i번째로 갈 수 있는지를 확인한는 과정
                ch[i] = 1  # 방문처리 하고
                dfs(i)  # 다음 v번으로 들어간다.
                ch[i] = 0


n, m = map(int, input().split())
# 정점의 수 , 간선의 수
graph = [[0] * (n+1) for _ in range(n+1)]
ch = [0] * (n+1)  # 체크용
for _ in range(m):
    a, b = map(int, input().split())
    graph[a][b] = 1
cnt = 0
ch[1] = 1  # 1번노드를 방문했다고 체크하고 넘어간다.
dfs(1)
# 연결정보
print(cnt)
