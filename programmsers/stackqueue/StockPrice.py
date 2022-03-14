from collections import deque


def solution(prices):
    answer = []
    dq = deque(prices)
    while len(dq) >= 1:  # dq의 길이가 1이 될때까지
        time = 0  # while문을 돌때마다 시간은 0으로 초기화
        tmp = dq.popleft()
        for price in dq:  # prices dq를 돌면서
            time += 1  # 시간을 1 증가 시키고
            if price < tmp:  # 만약에 price가 tmp보다 작다면 break
                break
        answer.append(time)  # answer에 time을 append 시킨다.
    return answer


prices = [1, 2, 3, 2, 3]
print(solution(prices))
