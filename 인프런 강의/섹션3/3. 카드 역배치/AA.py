import sys

list = []
mylist = []
for i in range(1, 21):
    num = str(i)
    list.append(num)
for i in range(10):  # 10번 반복
    a, b = map(int, input().split())  # 구간 설정
    tmp = list[a-1:b]  # a부터 b구간까지 str형으로 tmp에 투입
    tmp = tmp[::-1]  # tmp를 역순으로 바꿔준다.
    list[a-1:b] = tmp  # 5번째부터 10번째까지라면 4번째부터 10까지 들어가야 한다
for i in list:
    num = int(i)
    mylist.append(num)

print(mylist)
