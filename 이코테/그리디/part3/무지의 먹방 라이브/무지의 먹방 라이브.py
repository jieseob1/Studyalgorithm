import heapq
def solution(food_times, k):
    if sum(food_times) < k: # food_times의 총합이 k보다 작은 경우는 -1리턴
        return -1 
    h = []
    for i in range(len(food_times)): #food_times의 길이만큼 돌면서
        heapq.heappush(h, (food_times[i],i+1)) #(음식을 먹는데 걸리는 시간, 음식 번호)
    n = len(food_times)
    last_food = 0
    while k - (h[0][0] - last_food) * n >= 0: # heappop을 하므로 h[0][0]을 빼야지 된다.
        cur = heapq.heappop(h)[0] # h에서 음식을 먹는데 걸리는 시간을 뺀다.
        k -= (cur - last_food)*n # k -= 3
        n -= 1 # n =3 -> 2
        last_food = cur
    h.sort(key =lambda x:x[1]) # 음식 번호로 정렬
    return h[k%n][1] # k번쨰에 있는 음식의 번호를 보여준다.

food_times = [3,1,2]
k = 5 #방송 중단 시간
print(solution(food_times,k))