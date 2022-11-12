# https://www.acmicpc.net/problem/2606

numberOfComputer = int(input()) # 100대이하
pairOfDirectConnectedComputer = int(input())
graph = [[0] * (numberOfComputer + 1) for _ in range(numberOfComputer + 1)]

# set computer graph
for _ in range(pairOfDirectConnectedComputer):
    a,b = map(int, input().split())
    graph[a][b] = graph[b][a] = 1
# 1. 왜 add 혹은 append로 해줘야 하는지 이핵 안됨
infectedCoumputerCount = 0 
isInfected = list([False] * (numberOfComputer + 1))

def dfs(v): # v를 통해 걸리는 컴퓨터의 수
    global infectedCoumputerCount
    # global 찾아보기 
    isInfected[v] = True
    print("graph[v]:",graph[v])
    for i in graph[v]: # graph를 돌아야 했음
        if isInfected[i] == False:
            dfs(i)
            infectedCoumputerCount += 1
            # dfs 다음에 나와야 하는 이유 모르겠음
            
dfs(1)
print(isInfected)
print(infectedCoumputerCount)
