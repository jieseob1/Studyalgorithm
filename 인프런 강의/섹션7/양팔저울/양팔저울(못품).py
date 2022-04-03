def dfs(L, sum):
    global res

    if L == k: # 만약 k랑 같아졌으면
        if 0 < sum <= S:
            res.add(sum)
    else:
        dfs(L+1, sum+data[L])
        dfs(L+1, sum-data[L])
        dfs(L+1, sum)

k = int(input())
data = list(map(int,input().split()))
S= sum(data)
res = set()
dfs(0,0)
print(S-len(res))