from collections import deque

n, k = map(int, input().split())

q = []
for i in range(1, n+1):
    q.append(i)

dq = deque(q)  # deque 설정

while len(dq) > 1:  # dq의 길이가 1보다 크면 계속 반복
    for _ in range(k-1):
        dq.append(dq.popleft())  # 왼쪽거 2번 뺀다
    dq.popleft()

print(dq[0])
