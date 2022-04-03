n = int(input()) # n개의 동전
coin = list(map(int, input().split())) #각 동전의 화폐 단위를 나타내는 N개의 자연수 3 2 1 1 9
coin.sort()
target = 1
for x in coin:
    if target < x:
        break
    target += x
print(target)