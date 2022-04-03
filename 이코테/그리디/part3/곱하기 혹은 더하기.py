S = input()  # 0,1로만 이루어진 문자열 S
count = 0  # 뒤집는 횟수

res = int(S[0])  # res를 첫번째로 한다.
for i in range(1, len(S)):  # 1부터 n-1까지
    num = int(S[i])
    if res <= 1 or num <= 1:  # res,num이  1보다 작거나 같을때 -> 이부분에 대한 아이디어가 중요함
        res += num
    else:
        res *= num
print(res)
