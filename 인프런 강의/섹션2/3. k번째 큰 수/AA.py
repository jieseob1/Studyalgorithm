# 중복 허용,3장 뽑아 카드에 적힌수 합, 3장을 뽑을 수 있는 모든 경우 기록
# index,value ->enumerate 뽑음
n, k = map(int, input().split())
valueofn = list(map(int, input().split()))

res = set()  # 중복 제거

for i in range(n):
    for j in range(i+1, n):
        for m in range(j+1, n):
            res.add(valueofn[i] + valueofn[j] + valueofn[m])
res = list(res)
res.sort(reverse=True)

print(res[k-1])
