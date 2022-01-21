s = input()
stack = []
cnt = 0

for i in range(len(s)):
    if s[i] == '(': #만약에 여는괄호 이면, 스택에 추가시킨다.
        stack.append(s[i])
    else: #닫힌 괄호일때 
        stack.pop() #닫힌괄호를 만나게 되면 stack에서 pop을 해주게 되고,
        if s[i-1] == '(' #그리고 여기서 봐야할게 닫힌괄호앞에 여는괄호인지 닫힌괄호인지 봐줘야 한다
        #여기는 만약 닫힌 괄호앞에 여는괄호였으면 레이저를 쏘고 cnt를 증가시킨다.
            cnt += len(stack) #스택에 쌓여있는 만큼 cnt를 증가시킨다.
        else: ##만약 닫힌 괄호만 있다면 cnt를 1개씩만 더 추가로 더해준다.
            cnt += 1

#어렵

