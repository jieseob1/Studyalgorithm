

s = input()

alphabet = []
cnt = 0
for i in s:  # s를 돌면서
    if i.isalpha():  # i가 알파벳이면
        alphabet.append(i)
    else:
        cnt += int(i)

alphabet.sort()
if cnt != 0:
    alphabet.append(str(cnt))
print(''.join(alphabet))
