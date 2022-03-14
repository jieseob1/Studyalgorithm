def solution(n,computers):
    answer = 0
    visited = [False for _ in range(n)] # n의 개수만큼 visited를 만든다.
    for com in range(n): #n번을 돌면서
        if visited[com] == False: #n을 돌면서 
            dfs(n,computers, com,visited) #갯수, 그래프, 간선, 방문여부
    return answer
# dfs를 통해 최대한 깊이 들어가서 모두 확인한다음에 없는것을 확인했으면 answer를 1 증가시킨다.

def dfs(n, computer, com, visited):
    visited[com] = True  # com에 해당하는 위치를 방문했다고 하고
    for connect in range(n):  # #컴퓨터의 대수만큼 돌면서
        if connect != com and computer [com][connect] == 1: # 연결된 컴퓨터
         # d
            if visited[connect] == False:
                dfs(n, computers, connect, visited)
        



computers = [[1, 1, 0], [1, 1, 0], [0, 0, 1]]
n = 3
