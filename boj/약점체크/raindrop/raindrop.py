# https://www.acmicpc.net/problem/14719

h,w = map(int,input().split())
# h:세로 길이, w: 가로길이
graph = [[0] * (w) for _ in range(h)]
block_height = list(map(int, input().split()))

for i in range(w):
    for j in range(0,block_height[i]):# 0부터 bloc_height까지 돌면서
        graph[h-j-1][i] = 1 # 0,1,2 => 3,2,1

for i in range(0,h):
    print(graph[i])
    