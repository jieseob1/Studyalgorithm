import heapq


INF  = int(1e9)
n = 10
distance = [INF] * (n+1)
queue = []
    #시작 노드로 가기 위한 최단 경로는 0으로 설정하여, 큐에 삽입
heapq.heappush(queue, (0,1)) #출발노드의 거리가 0이도록 설정합니다 -> (우선순위, 값)  0번째에 start가 들어가도록 하는 듯?
distance[1] = 0

print(distance)
print(queue)