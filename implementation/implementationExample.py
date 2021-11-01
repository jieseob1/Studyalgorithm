data = input()

result = []
cnt =  0
for x in data:
    if x.isalpha():
        result.append(x)
    else:
        cnt += int(x)

result.sort()
result.append(str(cnt))
print(''.join(result))
