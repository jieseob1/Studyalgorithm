from collections import deque


def solution(priorities, location):
    answer = 0
    cnt = 0
    idxList = []

    for (idx, priority) in enumerate(priorities):
        idxList.append((idx, priority))
    dq = deque(idxList)
    while dq:
        tmp = dq.popleft()  # 제일 왼쪽 꺼 하나를 뺀다.
        if all(tmp[1] >= x[1] for x in dq):  # 모든 경우를 만족한다면
            cnt += 1
            if tmp[0] == location:  # idx부분이 location과 같아진다면
                return cnt
        else:
            dq.append(tmp)
    return cnt


priorities = [2, 1, 3, 2]
location = 2
print(solution(priorities, location))
