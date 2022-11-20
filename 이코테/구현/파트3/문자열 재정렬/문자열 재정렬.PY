s = input() # 문자열 s
data = []
num = 0
for elem in s:
    if elem.isdecimal():
        num += int(elem)
    else:
        data.append(elem)
data.sort()
data.append(str(num))
print(data)
print(''.join(data))