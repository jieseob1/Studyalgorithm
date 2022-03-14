import heapq


def solution(scoville, K):
    heapq.heapify(scoville)  # scoville 리스트를 heap으로 만들어준다.
    answer = 0
    while scoville[0] < K:  # 모든 스코빌 지수가 7이상이 될때까지
        leastest = heapq.heappop(scoville)
        print("leastest:", leastest)
        nextLeast = heapq.heappop(scoville)
        print("nextLeast:", nextLeast)
        newScoville = (leastest + nextLeast*2)
        print("newScoville:", newScoville)
        heapq.heappush(scoville, newScoville)
        answer += 1
    print(answer)


scoville = [1, 2, 3, 9, 10, 12]
solution(scoville, 7)
