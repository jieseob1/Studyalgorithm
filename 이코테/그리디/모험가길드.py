n = int(input())  # 모험가의 수
a = list(map(int, input().split()))
a.sort()

result = 0
count = 0
for i in a:
    count += 1
    print("count:", count)
    print("i:", i)
    if count >= i:
        result += 1
        count = 0
    print("result:", result)

print(result)
