a = input().split('-')
s = 0
for i in a[0].split('+'):
    s += int(i)
for i in a[1:]:
    print("after:", i)
    for j in i.split('+'):  # [50,40]으로 나누어지게 된다.
        print("after split:", j)
        s -= int(j)
print(s)
