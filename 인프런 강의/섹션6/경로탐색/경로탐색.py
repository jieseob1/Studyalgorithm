def dfs(v):
    # v는 노드 번호
    global cnt
    if v == n:  # 종착 지점
        cnt += 1
    else:
        for i in range(1, n+1):  # n가지로 가지가 뻗는다.
            # i: 방문하려고 하는 노드 번호
            # v에서 i로 갈수 있는지 확인하는 부분 방문 안했어야 한다.
            if graph[v][i] == 1 and ch[i] == 0:
                ch[i] = 1  # 방문 표시
                print(ch)
                dfs(i)  # v에서 i로 넘어가니까 i로 넘어가야 한다.
                # 백하는 지점
                ch[i] = 0


n, m = map(int, input().split())
graph = [[0]*(n+1) for _ in range(n+1)]
ch = [0] * (n+1)  # 체크 기능
for _ in range(m):
    a, b = map(int, input().split())  # 연결 정보
    graph[a][b] = 1
cnt = 0
ch[1] = 1
dfs(1)
print(cnt)
