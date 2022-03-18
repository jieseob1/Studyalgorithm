from re import I


n, k = map(int, input().split())
coin = []
cnt = 0
for _ in range(n):
    coin.append(int(input()))

coin.sort(reverse=True)

for i in coin:
    if k == 0:
        break
    if k >= i:
        tmp = k // i
        cnt += tmp
        k -= tmp*i
print(cnt)
