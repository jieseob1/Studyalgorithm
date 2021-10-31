INF = int(1E9)

#노드의 개수 및 간선의 개수 입력
n  = int(input())
m = int(input())

#2차원 리스트(그래프 표현)를 만들고,무한으로 초기화
graph = [[INF] for _ in range(n+1)]

#자기 자신에서 자기 자신으로 가는 비용은 0으로 초기화
for a in range(1, n+1):
    for b in range(1, n+1):
        if a == b:
            graph[a][b] = 0

#각 간선에 대한 정보를 입력 받아, 그 값으로 초기화
for _ in range(m):#m번만큼 반복수행을 진행한다
    #A에서 B로 가는 비용은 C라고 설정
    a,b,c = map(int, input().split())
    graph[a][b] = c
#간선에 관한 정보를 입력 받습니다

#점화식에 따라 플로이드 워셜 알고리즘을 수행
for k in range(1, n+1): #는 각 노드를 뜻한다 1번노드를 거쳐갈 경우 더 빠른지에 대한 것
    for a in range(1, n+1):
        for b in range(1, n+1):
            graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])

#수행된 결과를 출력한다.
for a in range(1, n+1):
    for b in range(1,n+1):
        #도달할 수 없는 경우 무한이라고 출력합니다
        if graph[a][b] == INF:
            print("INFINITY", end = ' ')
        #도달할 수 있는 경우 거리를 출력
        else:
            print(graph[a][b], end = " ")
    print()
