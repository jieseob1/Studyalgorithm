import heapq


def solution(scoville, K):
    count = 0
    heapq.heapify(scoville)  # scoville 리스트 힙으로 변경
    while (scoville[0] < K and len(scoville) > 1):  # 모든 음식의 스코빌 지수가 K 이상일때까지
        first = heapq.heappop(scoville)
        second = heapq.heappop(scoville)
        new_scoville = first + (second * 2)
        heapq.heappush(scoville, new_scoville)
        count += 1
    # scoville[0]이 K보다 크면 count return 해주고 그게 아니라면 -1을 리턴한다.
    return count if scoville[0] >= K else -1


scoville = [1, 2, 3, 9, 10, 12]
K = 7
print(solution(scoville, K))
