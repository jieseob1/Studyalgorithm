from collections import deque


need = input()  # 필수과목
n = int(input())  # n개의 수업 설계


for i in range(n):  # n번만큼 본다
    plan = input()  # 먼저 플랜을 받고
    cnt = len(need)
    for x in need:  # need를 돌면서 plan안에 들어있는지를 확인한다
        if x in plan:  # 플랜에 들어있으면
            cnt -= 1  # 카운트를 1만큼 줄여준다.
