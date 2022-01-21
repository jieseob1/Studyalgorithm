
import heapq as hq

a = []
res = []
while True:
    n = int(input())
    # n으로 계속 예제를 받게 된다
    if n == -1:
        break
    if n == 0:
        # n이 0이게 되면 최대값을 빼낸다
        if len(a) == 0:
            print(-1)
        else:
            res.append(hq.heappop(a))
    else:
        hq.heappush(a, (-n, n))

for x in res:
    print(x[1])
