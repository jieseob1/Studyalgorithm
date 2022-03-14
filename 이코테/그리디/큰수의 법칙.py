n, m, k = map(int, input().split())  # n:배열 크기, m:숫자가 더해지는 횟수, k: 최대 수
a = list(map(int, input().split()))

a.sort()  # a부분 정렬
count = 0
res = 0
print(a)
for _ in range(m):  # m번을 돌면서 맨 뒤에 있는 거 더해주고 만약 count가 k랑 같아지면 count 0으로 초기화 시켜주고 n-1번째 더해주기
    print("count:", count)

    if count == k:
        res += a[n-2]
        count = 0
    else:
        res += a[n-1]
        count += 1
    print("res:", res)

print(res)
