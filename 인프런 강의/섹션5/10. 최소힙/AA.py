import heapq as hq
h = []
res = []
while True:  # 무한 루프를 돌면서
    n = int(input())  # 먼저 input을 받고
    if n == -1:
        break
    if n == 0:
        if len(h) == 0:
            print(-1)
        else:
            res.append(hq.heappop(h))
    else:
        hq.heappush(h, n)  # h 리스트에 n을 넣어준다.

for x in res:
    print(x)
