a = input()
stack = []
res = ''

for x in a:
    if x.isdecimal():  # 만약에 x가 그냥 숫자라면 res에 더해준다
        res += x
    else:  # 숫자가 아니라면
        if x == '(':
            stack.append(x)  # 스택에 괄호를 집어넣는다
        elif x == '*' or x == '/':  # x가 곱하기나 나누기라면
            # stack이 비어짔지 않고 stack의 마짐막이 곱하기거나 stack의 마지막이 나누기일동안
            while stack and (stack[-1] == '*' or stack[-1] == '/'):
                res += stack.pop()  # 만약 곱하기와 나누기가 나오면 스택 맨 끝에 곱하기와 나누기가 있을때까지 계속 pop을 한다
            stack.append(x)
        elif x == '+' or x == '-':
            while stack and stack[-1] != '(':  # 더하기나 빼기 앞에 괄호가 없을때까지
                res += stack.pop()
            stack.append(x)
        elif x == ')':
            while stack and stack[-1] != '(':
                res += stack.pop()
            stack.pop()
while stack:
    res += stack.pop()
print(res)
