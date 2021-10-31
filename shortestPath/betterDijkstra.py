import heapq
import sys
input = sys.stdin.readline
INF = int(1e9)

#노드의 개수,간선의 개수 입력받기
n,m = map(int,input().split())
#시작 노드 번호를 입력받기 ex) 저는 1번 노드에서부터 시작할 예정입니다
start = int(input())
#각 노드에 연결되어 있는 노드에 대한 정보를 담는 리스트 만들기 아래 graph[a].append((b,c)) 이부분에서 사용될거고 이말은 "a번 노드에서 b번노드로 가는 비용이 c이다" 라는 말입니다.
graph = [[] for i in range(n + 1)]
#n+1 만큼의 []배열을 graph에다 만듭니다
#모든 거리를 무한대로 초기화 시킵니다
distance = [INF] * (n+1)
# 이 부분에선 별도로 방문처리 되었는지를 확인하는 테이블이 필요하지 않습니다. 따라서 별도의 visited라는 변수를 사용하지 않습니다.
#모든 간선 정보 입력받기
#초반 변수는 start, graph, distance 이렇게 있으며,
# start는 초반에 어느 노드에서 시작할껀지를 설정 graph는 각 노드에 연결된 노드에 대한 정보를 담는 리스트,
# 마지막으로 distance 같은 경우는 각 거리마다의 거리를 표현하며 초기화는 무한으로 진행한다


for _ in range(m): #m번만큼 같은 동작을 반복
    a,b,c = map(int, sys.stdin.readline())
    # map:리스트의 요소를 지정된 함수로 처리해준다-> map(함수, 리스트) 즉, 우리는 map(int, input().split()) 이런식으로 사용했으니, int함수로 리스트를 처리한다는 말이 된다.
    #a번 노드에서 b번 노드로 가는 비용이 c라는 의미입니다
    graph[a].append((b,c))
# graph에서의 a는 노드의 번호를 의미하고 append((b,c))는 b노드까지 가는대에 대한 c:비용이 된다
def dijkstra(start):
    queue = []
    #시작 노드로 가기 위한 최단 경로는 0으로 설정하여, 큐에 삽입
    heapq.heappush(queue, (0,start)) #출발노드의 거리가 0이도록 설정합니다 -> (우선순위, 값)  0번째에 start가 들어가도록 하는 듯?
    distance[start] = 0
    #처음 시작하는 부분에 거리는 0으로 설정
    #start는 출발 노드를 의미


    while queue: #큐가 비어있지 않는다면 즉,queue가 아무것도 없을때까지는 true이기 때문에 계속 반복한다
        #가장 최단 거리가 짧은 노드에 대한 정보를 꺼냅니다.
        dist,now = heapq.heappop(queue)
        #현재 노드가 이미 처리된 적이 있는 노드라면 무시한다
        #우선순위 큐는 제일 짧은 노드에 대한 정보가 먼저 나오도록 구현되어 있다.
        if distance[now] < dist: #이미 처리된 노드를 지칭
            #distance[now]는 현재에 대한 노드를 뜻한다
            continue
            #현재 노드와 연결된 다른 인접한 노드들을 확인
        for i in graph[now]:
            cost = dist + i[1] #i[1] 은 거리값을 의미한다.
            #현재 노드를 거쳐서, 다른 노드로 이동하는 거리가 더 짧은 경우
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(queue, (cost, i[0]))
#start는 맨처음 부분에서 받아놓는다.
dijkstra(start)

for i in range(1,n+1):
    if distance[i] == INF:
        print("infinity")
    else:
        print(distance[i])
