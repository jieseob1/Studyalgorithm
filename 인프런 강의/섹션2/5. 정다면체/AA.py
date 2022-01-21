import sys

n, m = map(int, input().split())
cnt = [0] * (n+m+1)
max = 0

for i in range(1, dn+1):
    for j in range(1, m+1):
        cnt[i+j] += 1  # 카운트 해주는 부분
for i in range(n+m+1):
    if cnt[i] > max:  # 최대값 찾아주는 부분
        max = cnt[i]
for i in range(n+m+1):
    if cnt[i] == max:  # 만약에 cnt가 최대값이라면
        print(i, end=' ')
