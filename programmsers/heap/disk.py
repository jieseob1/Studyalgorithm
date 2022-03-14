import heapq


def solution(jobs):
    answer, now, i = 0, 0, 0  # now: 현재 시점
    start = -1  # 바로 이전에 완료한 작업의 시작 시간
    heap = []
    while i < len(jobs):  # 현재 시점에서 처리할 수 있는 작업을 heap에 저장
        for j in jobs:  # jobs의 요소들을 돌면서, 현재 j는 [0,3]
            # 현재 시점에서 처리할 수 있는 작업인지를 판별하는 조건 -> 작업의 요청시간이 바로 이전에 완료한 작업의 시작 시간(start)보다 크고 현재 시점(now)보다는 작아양 한다.
            if start < j[0] <= now:
                # ehap에다가 [작업이 걸리는 시간,요청이 들어온 시간]
                # 작업의 소요시간을 기준으로 넣어줘야 되기 때문에 j[1]부터 넣는다.
                heapq.heappush(heap, [j[1], j[0]])
        if len(heap) > 0:  # 처리할 작업이 있는 경우-현재 heap에 업두가 있는 경우
            cur = heapq.heappop(heap)  # 현재 들어가 있던 [3,0]이 나오게 된다.
            start = now
            now += cur[0]  # now에다가 일이 소요되는 시간을 넣는다.
            answer += now - cur[1]  # 작업 요청시간부터 종료시간까지의 시간 계산
            i += 1
        else:  # 처리할 작업이 없는 경우 다음 시간을 넘어감
            now += 1
    print(answer // len(jobs))


jobs = [[0, 3], [1, 9], [2, 6]]
solution(jobs)
