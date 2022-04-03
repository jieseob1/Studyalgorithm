from itertools import combinations

n, m = map(int, input().split())
chicken, house = [], []

for r in range(n) :
    #도시의 정보가 주어진다.
  data = list(map(int, input().split()))
  for c in range(n) :
    if data[c] == 1 :
      house.append((r, c)) # 집
    elif data[c] == 2 :
      chicken.append((r, c)) # 치킨 집
print("chicken:",chicken)
print("house:",house)
# 모든 치킨집 중에서 m개의 치킨집을 뽑는 조합 계산
candidates = list(combinations(chicken, m))
print(candidates) #(1,2),(2,2),(4,4)

# 치킨 거리의 합을 계산하는 함수
def get_sum(candidate) :
  result = 0
  # 모든 집에 대하여
  for hx, hy in house :
    # 가장 가까운 치킨집을 찾기
    temp = 1e9
    for cx, cy in candidate :
      temp = min(temp, abs(hx - cx) + abs(hy - cy))
    # 가장 가까운 치킨집까지의 거리를 더하기
    result += temp
  # 치킨 거리의 합 반환
  return result

# 치킨 거리의 합의 최소를 찾아 출력
result = 1e9
for candidate in candidates :
  result = min(result, get_sum(candidate))

print(result)