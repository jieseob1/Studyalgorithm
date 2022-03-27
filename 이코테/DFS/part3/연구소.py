# https://www.acmicpc.net/problem/14502

#  벽의 개수는 3개
n, m = map(int, input().split())  # n,m(=m은 가로)은 8보다 작다.
labMap = []
temp = [[0] * m for _ in range(n)]  # 벽을 설치한 뒤에 맵 리스트
for _ in range(n):  # n-1 개를 받아 들인다.
    labMap.append(list(map(int, input().split())))  # 리스트 안에 리스트 집어넣기

# 상하좌우 설정해주기
dx = [-1, 1, 0, 0]  # 위,아래 부분
dy = [0, 0, -1, 1]  # 좌,우 부분

result = 0
# 바이러스 전파해주는 부분


def virus(x, y):
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        # 상,하,좌,우 중 바이러스가 퍼질 수 있는 경우
        if nx >= 0 and ny >= 0 and nx < n and ny < m:
            if temp[nx][ny] == 0:  # 만약 temp가 0인 경우에
                temp[nx][ny] = 2  # 바이러스 배치하구 재귀로 다시 virus배치한다.(dfs)
                virus(nx, ny)


def get_score():
    score = 0
    for i in range(n):  # 세로 파트
        for j in range(m):  # 가로 파트
            if temp[i][j] == 0:  # 그래프를 돌면서 0일 경우에는
                score += 1
    return score  # score 리턴

# dfs를 이요하여 울타리를 설치하면서, 매번 안전 영역의 크기를 계산한다.


def dfs(count):
    global result
    if count == 3:  # count가 3이 된다면 -> 기둥 모두 설치
        for i in range(n):
            for j in range(m):
                temp[i][j] = labMap[i][j]  # labmap에 있느 것들을 temp에 옮긴다.
        for i in range(n):
            for j in range(m):
                if temp[i][j] == 2:  # 만약 바이러스가 존재하는 곳이 있으면, 바이러스를 퍼트린다.
                    virus(i, j)
        result = max(result, get_score())
        return
    # 1. 빈공간에 울타리 설치
    for i in range(n):
        for j in range(m):
            if labMap[i][j] == 0:  # 빈공간에 울타리 설치 하는 과정
                labMap[i][j] = 1
                count += 1
                dfs(count)
                labMap[i][j] = 0
                count -= 1


dfs(0)
print(result)
