n = int(input())
a = [list(map(int, input().split())) for _ in range(n)]
m = int(input())  # 회전명령 개수

for i in range(m):
    row_idx, direction, gridnum = map(int, input().split())  # 행번호, 방향,회전 격자 수
    if direction == 0:  # 만약에 움직이는 방향이 왼쪽이라면
        # row_idx,i번째 있는 것을 i-gridnum에다가 넣어주세요
        for _ in range(gridnum):
            a[row_idx-1].append(a[row_idx-1].pop(0))  # 앞에값 하나빼주고 다시 넣어준다.
    else:
        for _ in range(gridnum):
            a[row_idx-1].insert(0, a[row_idx-1].pop())

# 여기까지 움직이기 완료
s = 0
e = n-1
sum = 0
for i in range(n):
    for j in range(s, e+1):
        sum += a[i][j]
    if i < n // 2:
        s += 1
        e -= 1
    else:
        s -= 1
        e += 1
print(sum)
