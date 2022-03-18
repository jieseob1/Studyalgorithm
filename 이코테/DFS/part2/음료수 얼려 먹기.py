n, m = map(int, input().split())
data = []
for _ in range(n):  # n번을 돌면서
    data.append(list(map(int, input())))


def dfs(x, y):  # x,y좌표
    # 주어진 범위를 벗어나는 경우
    if x <= -1 or x >= n or y <= -1 or y >= m:
        return False
    # 현재 노드를 아직 방문하지 않았다면
    if data[x][y] == 0:
        data[x][y] = 1  # 방문처리를 해주고
        dfs(x-1, y)
        dfs(x+1, y)
        dfs(x, y-1)
        dfs(x, y+1)
        return True
    return False


# 모든 노드(위치)에 대하여 음료수 채우기
cnt = 0
# 모든 부분을 다 돈다
for i in range(n):
    for j in range(m):
        if dfs(i, j) == True:
            cnt += 1

print(cnt)
