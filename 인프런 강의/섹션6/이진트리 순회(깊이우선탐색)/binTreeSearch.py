def DFS(n):
    if n < 8:
        DFS(2 * n)
        print(n, end=' ')

        DFS(2*n+1)


DFS(1)
