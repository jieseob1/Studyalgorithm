# 아이디어: 각 리스트의 인덱스를 가리키는 p1,p2 2개의 포인터를 만들고, 한쪽이 끝날때까지
# while문을 돌게 하고 끝난다면 나머지는 slice를 써서 넣어주게 된다.
n = int(input())
a = list(map(int, input().split()))
m = int(input())
b = list(map(int, input().split()))

p1 = p2 = 0
sum_list = []

while p1 < n and p2 < m:  # true이니까 둘다 조건을 만족해야 하므로 and가 들어감
    if a[p1] <= b[p2]:  # a[p1]이 b[p2]보다 작거나 같을 경우 1이 2보다 작은 경우에는 1 먼저 들어가야 하므로
        sum_list.append(a[p1])
        p1 += 1
    else:
        sum_list.append(b[p2])
        p2 += 1
# 남은 부분은 슬라이싱으로 처리

if p1 < n:  # p1이 아직 남아있는 경우
    sum_list = sum_list + a[p1:]  # 이렇게 슬라이싱을 해주면 p1부터 나머지가 들어간다.
else:
    sum_list = sum_list + b[p2:]
print(sum_list, end=' ')
