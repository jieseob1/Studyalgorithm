# 내린 사람이 모두 내린 후에 기차에 탄다

count = 0
res = 0
for _ in range(10):
    in_passenger,out_passenger = map(int, input().split())
    count += (out_passenger - in_passenger)
    res = max(res, count)
print(res)