from collections import deque


def bfs(x, y):
    queue = deque()  # 처음 x,y를 넣어준다.
    queue.append((x, y))
    while queue:  # queue가 빌때까지 계속 반복
        x, y = queue.popleft()  # 왼쪽꺼 빼주고
        for i in range(4):  # 상,하,좌,우에 갈 수 있는 곳이 있는지를 찾아본다
            nx = x + dx[i]
            ny = y + dy[i]
            # 예외 케이스 2가지
            if nx < 0 or nx >= n or ny < 0 or ny >= m:  # 예외 케이스
                continue
            if graph[nx][ny] == 0:  # 괴물이 존재하는 부분
                continue
            if graph[nx][ny] == 1:  # 길이 존재하는 경우
                graph[nx][ny] = graph[x][y] + 1  # 1을 더해주고
                queue.append((nx, ny))
    return graph[n-1][m-1]


# 두개의 정수 n,m이 주어진다. 다음 N개의 줄에는 각각 M개의 정수(0 혹은 1)로 미로의 정보가 주어진다.
n, m = map(int, input().split())
graph = []
for _ in range(n):
    graph.append(list(map(int, input())))
# 상,하,좌,우 설정
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
# print(bfs(0, 0))
# 왼쪽이 row 부분, 오른쪽이 column 부분 즉, (6,5) 부분은 반대로 (5-1,6-1)이 된다.
print(bfs(0, 0))
# bfs로 푸는 문제
