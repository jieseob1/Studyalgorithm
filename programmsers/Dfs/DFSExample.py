def DFS(graph, v, visited):
    # 먼저 방문한것으로 체크하고 -> 해당 노드에서 그래프를 찾아 들어가 방문하지 않았다면 DFS를 통해 한단계 더 내려간다
    visited[v] = True
    print(v, end=' ')  # 1 2 7 6 8 3 4 5 -노드를 지나는 부분
    for i in graph[v]:  # graph의 첫번쨰를 탐색 graph[1]=[2,3,8] visitied[2,3,8]
        if not visited[i]:  # visited[2]가 f이면 다시 2번 아래로 탐색
            DFS(graph, i, visited)


graph = [[], [2, 3, 8], [1, 7], [1, 4, 5],
         [3, 5], [3, 4], [7], [2, 6, 8], [1, 7]]

visited = [False] * 9

DFS(graph, 1, visited)
