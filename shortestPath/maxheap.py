import heapq

# 내림차순 힙 정렬(Heap sort)
def heapSort(iterable):
    h = []
    result = []
    # 모든 원소를 차례대로 힙에 삽입합니다
    for value in iterable:
        heapq.heappush(h,-value)
        #현재 heapq를 사용하여 value에 있는 값을 h에 담는중입니다
    #힙에 삽입된 모든 원소를 차례대로 꺼내어 담습니다
    for i in range(len(h)):
        #h의 개수만큼 반복합니다
        result.append(-heapq.heappop(h))
    #     hㅇ에 담겨진 것을 heapq.heappop을 이용하여 result에 넣습니다
    return result

result = heapSort([1,3,5,7,9,2,4,6,8,0])
print(result)