data = input()

result = []
value = 0

for x in data:
    if x.isalpha():
        result.append(x)
    else:
        value += int(x)
        
result.sort()

if value != 0:
    result.append(str(value))
#최종 결과 출력(리스트를 문자열로 변환하여 출력)
print(''.join(result))