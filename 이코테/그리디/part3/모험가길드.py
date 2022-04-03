n = int(input())
data = list(map(int,input().split()))
data.sort() #1 2 2 2 3

#각 데이터를 돌면서 인원수 체크하고 
count = 0
group = 0 
for i in data:
    count += 1
    if count >= i: #공포도보다 인원수가 많아진다면 
        group += 1
        count = 0
print(group)