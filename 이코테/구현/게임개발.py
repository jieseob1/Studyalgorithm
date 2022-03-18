n, m = map(int, input().split())
x, y, d = map(int, input().split())  # x,y좌표와 방향 d
data = []
for _ in range(m):
    data.append(list(map(int, input().split())))

dx = [-1, 0, 1, 0]  # 왼쪽, 아래 ,오른쪽 ,위
dy = [0, -1, 0, 1]


print(data)
