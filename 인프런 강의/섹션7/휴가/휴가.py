def dfs(L, sum):
    if L == n+1:
        global res
        if sum > res:
            res = sum  # 갱신해주는 부분
    else:
        # L이 날짜, counT[L]이 앞으로 상담할 날짜 이부분이 L+1을 넘어서면 안된다.
        if L+counT[L] <= n+1:  # L이라고 잡힌 날짜를 상담한다.
            dfs(L+counT[L], sum + counP[L])  # 현재 날짜에 날짜에 잡힌 상담 날짜 기간을 더해준다
            dfs(L+counT[L], sum)
# L+counT[L]: 상담을 다해준 난뒤에 기간으로 간다.


n = int(input())
counT = list()
counP = list()
for _ in range(n):
    a, b = map(int, input().split())
    counT.append(a)
    counP.append(b)
res = -2147000000
counP.insert(0, 0)
counT.insert(0, 0)
# 초반에 0이 필요하기 때문ㅇ
dfs(1, 0)
# 인덱스가 날짜
print(res)
