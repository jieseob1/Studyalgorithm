# n = int(input())
# plans = map(str, input().split())
# # 정의 부분
# x, y = 1, 1
# dx = [0, -1, 0, 1]  # L,U,R,D 순
# dy = [-1, 0, 1, 0]

# for plan in plans:
#     if x < 1 or x > n or y < 1 or y > n:
#         continue
#     if plan == 'L':
#         x = x + dx[0]
#         y = y + dy[0]
#     elif plan == "U":
#         x = x + dx[1]
#         y = y + dy[1]
#     elif plan == "R":
#         x = x + dx[2]
#         y = y + dy[2]
#     elif plan == "D":
#         x = x + dx[3]
#         y = y + dy[3]
#     print(x, y, end=' ')

# print(x, y, end=' ')


n = int(input())
x, y = 1, 1
nx, ny = 0, 0
plans = input().split()

# L,R,U,D에 따른 방향
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
move_types = ['L', 'R', 'U', 'D']

# 이동 계획을 하나씩 확인
for plan in plans:
    # 이동 후 좌표 구하기
    for i in range(len(move_types)):
        if plan == move_types[i]:
            nx = x + dx[i]
            ny = y + dy[i]
    if nx < 1 or nx > n or ny < 1 or ny > n:
        continue
    x, y = dx, dy
print(x, y, end=' ')
