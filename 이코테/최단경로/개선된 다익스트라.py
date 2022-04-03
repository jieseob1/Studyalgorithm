import heapq
import sys
input = sys.stdin.readline
INF = 1e9

# 노드의 개수, 간선의 개수를 입력받기
n, m = map(int, input().split())

# 시작 노드 번호 받기
start = int(input())

# 각 노드에 연결되어 있는 노드에 대한 정보를 담는 리스트를 만들기
graph = [[] for _ in range(n+1)]  # 노드의 개수만큼 그래프 만들기
# 최단 거리 테이블 모두 무한으로 초기화
distance = [INF] * (n+1)
for _ in range(m):
    a, b, c = map(int, input().split())
    graph[a].append((b, c))  # b번 노드로 가는 비용이 c라는 의미


def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))  # q에 거리,시작노드를 넣어주기
    distance[start] = 0  # 시작 노드를 0으로 처리하기
    while q:  # q가 비어있지 않은 경우
        # 가장 최단 거리가 짧은 노드에 대한 정보 꺼내기
        dist, currentNode = heapq.heappop(q)  # 거리와 현재 노드
        # 현재 노드가 이미 처리된 적이 있는 노드라면 무시
        if distance[currentNode] < dist:  # 현재 노드가 이미 처리된 적이 있는 노드라면 무시
            continue
        # 현재 노드와 연결된 다른 인접한 노드들을 확인
        for i in graph[currentNode]:
            cost = dist + i[1]  # 거리에다가 비용을 더해준다.
            # 현재 노드를 거쳐서, 다른 노드로 이동하는 거리가 더 짧은 경우
            if cost < distance[i[0]]:  # cost가 b노드의 거리보다 더 작은 경우
                distance[i[0]] = cost  # 갱신하고, heappush로 넣어준다.
                heapq.heappush(q, (cost, i[0]))


# 다익스트라 알고리즘 수행
dijkstra(start)

# 모든 노드로 가기 위한 최단 거리를 출력
for i in range(1, n+1):
    # 도달할 수 없는 경우, 무한(infinity)이라고 출력
    if distance[i] == INF:
        print('INFINITY')
    else:
        print(distance[i])
