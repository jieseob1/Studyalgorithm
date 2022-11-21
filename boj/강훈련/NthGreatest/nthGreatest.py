t = int(input())
res = []
for _ in range(t):
    a = list(map(int,input().split()))
    a.sort(reverse = True)
    res.append(a[2])

for i in range(t):
    print(res[i])

    
