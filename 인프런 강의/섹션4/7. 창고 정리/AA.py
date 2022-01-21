l = int(input())
a = list(map(int, input().split()))
m = int(input())
a.sort()

for _ in range(m):
    a[l-1] -= 1
    a[0] += 1
    a.sort()
cnt = a[l-1] - a[0]
print(cnt)
