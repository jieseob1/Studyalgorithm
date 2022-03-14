n, m = map(int, input().split())
# n:세로 ,m:가로
a = []
for _ in range(n):
    a.append(list(map(int, input().split())))
# 뚫려있는 부분 0, 그렇지 않은 부분 1
#상하좌우 붙어 있는 경우는 서로 연결되어 있는 것을 ㅗ가눚

#dfs
#주어진 범위를 벗어나면 False 반환 
# 현재 노드를 아직 방문 하지 않았다면 방문처리 하고
#상,하,좌,우의 위치도 모두 재귀적으로 호출