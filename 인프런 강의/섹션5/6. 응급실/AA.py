from collections import deque

n, m = map(int, input().split())
q = [(pos, val) for pos, val in enumerate(list(map(int, input().split())))]


dq = deque(q)
cnt = 0
while True:
    tmp = dq.popleft()  # 왼쪾꺼 빼냄
    if any(tmp[1] < x[1] for x in dq):  # dq를 돌면서 혹시 x가 큰게 하나라도 있게된다면
        dq.append(tmp)
        # 다시 추가해줄것
    else:  # 만약 최고라면
        cnt += 1  # 카운트를 올려준다.
        if tmp[0] == m:  # 만약 맨 앞에 있는게 m과 같게 된다면
            print(cnt)  # 카운트를 print해주고
            break  # break를 해준다
