n = int(input())  # 격자판 수

a = [list(map(int, input().split())) for _ in range(n)]  # 이거 중요
# 이렇게하면 내가 넣은 부분이 a 안에 바로 들어가게 된다.
max = 0
for i in range(n):
    sum1 = sum2 = 0
    for j in range(n):
        sum1 += a[i][j]
        sum2 += a[j][i]
        if sum1 > max:
            max = sum1
        if sum2 > max:
            max = sum2
sum1 = sum2 = 0
for i in range(n):
    sum1 += a[i][i]
    sum2 += a[i][n-1-i]
    if sum1 > max:
        max = sum1
    if sum2 > max:
        max = sum2

print(max)
