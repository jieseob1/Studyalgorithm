# 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출
# 그 순서대로 자연수를 만든다
# 만들어진 자연수와 그 자연수의 약수 개수 출력
word = input()  # 문자와 숫자가 섞여있음
digit = []
numeric = ''
cnt = 0
for i in word:
    if i.isnumeric():  # 만약에 문자열이 숫자로 되어있으면
        digit.append(i)  # digit 리스트에 넣는다
for i in digit:  # digit를 각각 돌면서
    numeric += i
numeric = int(numeric)  # numeric을 int형으로 바꿔준다.

for k in range(1, numeric+1):  # 1부터 numeric까지
    if numeric % k == 0:  # 나누어 떨어지게 되면
        cnt += 1


print(numeric, cnt, sep='\n')
