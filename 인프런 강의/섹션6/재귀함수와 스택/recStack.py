def DFS(x):
    if x > 0:
        # print(x)
        # DFS(x-1)
        DFS(x-1)
        print(x, end=' ')  # 1 2 3 으로 출력됨 ->스택을 활용해서 운영되기 때문이다


n = int(input())
DFS(n)
