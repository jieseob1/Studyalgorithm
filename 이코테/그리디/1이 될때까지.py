n, k = map(int, input().split())

cnt = 0
while n > 1:  # n이 1보다 크거나 같을때까지

    if n % k == 0:  # 나누어 떨어지는 경우
        n = n / k
        cnt += 1
    else:
        n -= 1
        cnt += 1
print(cnt)
