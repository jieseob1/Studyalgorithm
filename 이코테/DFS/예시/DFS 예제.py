def dfs(graph, v, vistied):  # 파라미터로 그래프와 노드 그리고 방문 여부가 들어간다.
    # 프로세스: dfs에 들어가게 되면 방문 처리를 해주고, 해당 노드를 print를 해준다. 그리고 해당 노드에 대한 그래프를 돌면서 만약 visited[i]가 false이면 다시 dfs를 통해 순회한다.
    visitied[v] = True  # 방문 처리
    print(v, end=' ')
    for i in graph[v]:  # 해당 노드에 연결된 그래프를 돈다.
        # 그래프에서 1번 부분은 [2,3,8]이고 2,3,8을 돌면서 방문여부를 확인하여 방문하지 않았으면, dfs로 다시 더 들어간다.
        if not vistied[i]:
            dfs(graph, i, visitied)


graph = [
    [],
    [2, 3, 8],
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7],
]

visitied = [False] * 9

dfs(graph, 1, visitied)
