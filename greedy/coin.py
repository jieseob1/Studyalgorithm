# https://www.acmicpc.net/problem/11047

n,k = list(map(int, input().split()))
#동전 n종류, 가치의 합 k

array = []
for i in range(n):
 array.append(int(input()))

array.sort(reverse=True)
count = 0
#앞으로

for coin in array:
  count += k // coin
  #4200원을 coin으로 나눈 몫
  k = k % coin
  # 4200원에서 1000원짜리로 하면 200원 남음

# 문제 어렵게 생각하지 말자 굳이 if문같은 거 쓰지 않고 나누기와 몫같은 걸로 나올수 있는 문제
print(count)