# https://unie2.tistory.com/700

from collections import deque

n,k = map(int, input().split()) # n은 시험관의 크기, 바이러스의 종류는 k
graph =[] # 전체 보드를 담는 리스ㅌ
data = [] # 바이러스에 대한 정보를 담는 data 리스트 여기에는 바이러스 종류와, 시간,x,y축이 들어간다.
for i in range(n):
    graph.append(list(map(int, input().split()))) # graph 생성
    for j in range(n): #그래프의 정보를 읽어들여서
        if graph[i][j] != 0: #만약 안에있는것이 0이 아니라면 바이러스의 종류이기 때문에 data에 정보들을 넣는다.
            data.append((graph[i][j],0,i,j)) #바이러스 종류, 현재 시간, x,y축을 넣는다
#데이터 정렬 이후 큐로 옮기기(낮은 번호의 바이러스가 먼저 즈식하기 때문에)
data.sort()
q = deque(data)
print("hello q",q)

#4가지 방향 -> 북,동,남,서

target_s,target_x,target_y = map(int, input().split()) # s초후 ,(x,y)의 그래프에 어떤 바이러스가 존재하는지를 확인
dx = [-1,0,1,0]
dy = [0,1,0,-1]

while q:
    virus, time ,x, y = q.popleft() #제일 왼쪽에 있는 값을 빼낸다 
    if time == target_s:
        break
    for i in range(4):
        nx = x+ dx[i]
        ny = y + dy[i]
    #그래프 안에서만 돌때
        if nx >= 0 and nx < n and ny < n and ny >= 0:
            #만약 아직 바이러스가 존재하지 않는 경우라면
            if graph[nx][ny] == 0: 
                graph[nx][ny] = virus #바이러스를 심는다.
                q.append((virus, time + 1, nx, ny))
print(graph[target_x-1][target_y-1])


    