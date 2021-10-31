#n은 화폐 종류의 가지수
#m은 가치의 합
n,m = list(map(int, input().split()))
# 이후 n개의 춪레은 각 화폐의 가치가 주어진다, 화폐 가치는 10,000보다 작거나 같은 수

array = []
for i in range(n):
    array.append(int(input()))
#     이렇게 array =[] 이 부분과 array.append 이부분이 중요
# n은 최대 100까지, m은 최대 10000까지이다
#첫쨰 줄에 m원을 만들기 위한 치소한의

print()