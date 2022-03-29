# dfs 더하고 빼기로
def dfs(L, sum):
    if L == k:
        dataset.add(sum)
    else:
        if sum >= 0:
            dfs(L+1, sum + data[L])
            dfs(L+1, sum - data[L])


k = int(input())
data = list(map(int, input().split()))
dataset = set()
dfs(0, data[0])
print(dataset)
