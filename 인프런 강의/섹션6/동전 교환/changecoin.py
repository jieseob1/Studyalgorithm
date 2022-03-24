def dfs(L, sum):
    if sum > m:
        return
    if sum == m:
        if L < res:
            res = L
    else:
        for i in range(n):
            res[L] = coinType[i]
            dfs(L+1, sum + res[L])

            dfs(L+1, sum)


n = int(input())  # 동전의 종류 개수
coinType = list(map(int, input().split()))
m = int(input())  # 거슬러 줄 금액
# 제일 큰걸로 먼저 찾고 끝나면 바로 break로 뛰쳐나옴
res = 21470000000
coinType.sort(reverse=True)
