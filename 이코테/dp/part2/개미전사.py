n = int(input())
data= list(map(int, input().split()))     
d = [0] * 100
# 메모이제이션을 하기 위함
d[0] = data[0]
d[1] = max(data[0],data[1])
    
for i in range(2,n):
    #데이터 리스트의 길이만큼 돌 예정 -> d[0] 과 d[1]만 설정해주고 나머지는 max로 처리
    d[i] = max(d[i-1], d[i-2]+ data[i])
    
print(d[n-1])