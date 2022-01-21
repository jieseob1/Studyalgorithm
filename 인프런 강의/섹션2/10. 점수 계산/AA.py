# ox문제 두가지 경우의 답을 가짐.
n = int(input())  # 문제의 개수
a = map(int, input().split())
accu = 0  # 가산점을 위함
sum = 0
for i in a:
    if i == 1:  # 만약에 맞다면
        accu += 1  # 가산점에 1점을 추가 시기코
        sum += accu  # 가산점을 sum에 더해준다
    elif i == 0:
        accu = 0  # 가산점을 0으로 만들고
        sum += accu  # 0점이 된 가산점을 더해준다


print(sum)
