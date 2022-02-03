from collections import deque


def solution(priorities, location):
    a = list((pos, val)
             for pos, val in enumerate(priorities))  # 각 우선순위에 index를 매김
    cnt = 0
    while True:
        tmp = a.pop(0)  # 맨왼쪽꺼 빼준다.
        if any(tmp[1] < x[1] for x in a):  # 어느하나라도 tmp가 작게 된다면 1 1 9
            a.append(tmp)
        else:  # 제일 큰게 존재하면
            cnt += 1
            if tmp[0] == location:
                ans = cnt
                break
    print("ans:", ans)


priorities = [1, 1, 9, 1, 1, 1]
location = 0

print(solution(priorities, location))
