# N개의 도시가 있다. 그리고 한 도시에서 출발하여 다른 도시에 도착하는 M개의 버스가 있다. 
# 우리는 A번째 도시에서 B번째 도시까지 가는데 드는 버스 비용을 최소화 시키려고 한다. A번째 도시에서 B번째 도시까지 가는데 드는 최소비용을 출력하여라. 도시의 번호는 1부터 N까지이다.

n = int(input()) # n: 도시의 갯수 1~1000
m = int(input()) # m: 버스의 갯수  1~100,000
data = [[0] * (n+1) for _ in range(n+1)] 

for _ in range(m):
    start, arrive, cost = map(int, input().split())
    data[start][arrive] = cost # put cost 
    
