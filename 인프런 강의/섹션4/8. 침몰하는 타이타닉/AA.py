from collections import deque

n, m = map(int, input().split())
# n:승객, m:kg제한
# 구명보트는 2명 이하로만 탈 수 있음

a = list(map(int, input().split()))  # n개로 구성된 몸무게 수열

a.sort()  # 50 60 70 90 100
a = deque(a)
sum = 0
cnt = 0

while a:  # a가 비어있으면 거짓
    if len(a) == 1:
        cnt += 1
        break  # pop할 필요도 없이 그냥 break 하면 된다
    if a[0] + a[-1] > m:  # 만약에 몸무게를 초과했을 경우에 마지막 사람 빼주고 카운트는 1 올리고 다시 진행한다
        a.pop()
        cnt += 1
    else:
        # a.pop(0)
        a.popleft()
        a.pop()
        cnt += 1

print(cnt)
