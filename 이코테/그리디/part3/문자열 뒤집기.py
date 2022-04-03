# 1로 뒤집는 경우와 0으로 모두 뒤집는 케이스로 나눠서 min을 뽑아내는 문제
data= input()

count0 = 0
count1 = 0

# 첫 번째 원소에 대하여 처리
if data[0] == '1':
    count0 += 1 # 1이면 0으로 만들어줘야 하므로
else:
    count1 += 1
for i in range(len(data)-1):
    if data[i] != data[i+1]: #같지 않은 경우
        if data[i+1] == '1':
            count0 += 1
        else:
            count1 += 1
print(count0,count1)
