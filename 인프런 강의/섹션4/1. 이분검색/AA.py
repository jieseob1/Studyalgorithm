n, m = map(int, input().split())
a = list(map(int, input().split()))

lt = 0
rt = n - 1
res = 0
a.sort()

while lt <= rt:
    mid = (lt+rt) // 2
    if a[mid] == m:
        res = (mid+1)
        break
    elif a[mid] < m:  # 32를 찾고 싶었는데 a[mid]가 더 작은 경우에는 mid를 증가시켜줘야함
        lt = mid + 1
    else:
        rt = mid - 1

print(res)
