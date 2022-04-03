data = map(str,input()) # 문자열 들어오는 파트
new_data = []
num = 0
s=''
for ele in data:
    if ele.isalpha():
        new_data.append(ele)
    else:
        num += int(ele)
new_data.sort()
new_data.append(str(num))
print(''.join(new_data))