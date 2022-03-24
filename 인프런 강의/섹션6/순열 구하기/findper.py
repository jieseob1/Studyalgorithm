def dfs(L):
    global cnt
    if L == m:
        for i in range(m):
            print(res[i], end=' ')
        cnt += 1
        print()
    else:
        for i in range(1, +1):
            if ch[i] == 0:  # ch가 0인 경우에는 1로 바꿔주고 res에 해당 숫자를 넣는다.
                ch[i] = 1
                res[L] = i
                dfs(L+1)  # dfs 진행이 끝나고 다시 돌아오게 되면 한번 사용했으므로 0으로 바꿔준다.
                ch[i] = 0


n, m = map(int, input().split())
res = [0] * n  # m개만큼 만든다.
ch = [0] * (n+1)
cnt = 0
dfs(0)
print(cnt)
