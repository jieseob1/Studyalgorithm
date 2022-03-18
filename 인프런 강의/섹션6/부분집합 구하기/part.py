def DFS(v):
    if v == n+1:
        for i in range(1, n+1):
            if ch[i] == 1:
                print(i, end=' ')
        print()

    else:
        ch[v] = 1  # 1로 사용한다는 것은 사용한다는 의미이다.
        DFS(v+1)
        ch[v] = 0  # 사용하지 않겠다
        DFS(v+1)


n = int(input())
ch = [0] * (n+1)  # 체크 변수
DFS(1)
