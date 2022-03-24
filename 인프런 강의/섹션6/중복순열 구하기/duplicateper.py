# 완전탐색
def dfs(L):
    global cnt

    if L == m:  # 만약 길이가 L만큼 된다면,
        for i in range(m):
            print(res[i], end=' ')
        cnt += 1
        print()
    else:  # 아직 길이가 L만큼 되지 않았다면
        for i in range(1, n+1):
            res[L] = i
            dfs(L+1)


n, m = map(int, input().split())
res = [0] * m  # n+1개만큼
cnt = 0
dfs(0)
print(cnt)
# n까지 번호가 적힌 구슬 중 중복을 허락하여 M번을 뽑아 일렬로 나열
