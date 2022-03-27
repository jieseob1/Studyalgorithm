def dfs(L, sum, time):  # level과 sum
    if sum > m:  # sum이 m보다 커지는 경우는 제한시간 초과
        return
    if sum <= m:  # 제한시간 안에 풀 경우


n, m = map(int, input().split())
# 문제의 개수 n, 제한 시간 m
pv = list()  # problem value
pt = list()  # problem time
for _ in range(n):
    a, b = map(int, input().split())  # 문제, 푸는데 걸리는 시간
    pv.append(a)  # pv 부분에는 문제점수가 들어간다.
    pt.append(b)  # pt 부분에는 제한시간이 들어간다.
res = -2147000000  # 최소 -> 답이 될 부분
dfs(0, 0, 0)
