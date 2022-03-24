n,m = map(int, input().split()) #n가지 종류의 화폐, 가치의 합 m원이 되도록
data = []
for _ in range(n):
    data.append(int(input()))

d = [10001] *  10000 #카운트 넣을 부분

d[0] = 0 # DP 진행(보텀업)

for i in range(n): #화폐 종류먼큼 돈다.
    for j in range(data[i], m+1): 
        if d[j - data[i]] != 10001: #(i-k)원을 만드는 방법이 존재하는 경우
            d[j] = min(d[j], d[j-data[i]] + 1)
#계산된 결과 출력
if d[m] == 10001:
    print(-1)
else:
    print(d[m])
