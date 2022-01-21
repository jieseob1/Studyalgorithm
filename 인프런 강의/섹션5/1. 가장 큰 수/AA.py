n, m = map(int, input().split())

n = list(map(int, str(n)))
stack = []
for i in n:
    # stack이 비어있을때 까지랑 그리고 제거해야할 m이 0으로 줄어들기 전까지
    while stack and m > 0 and stack[-1] < x:
        # stack[-1] 이 x보다 크면 안된다.
        stack.pop()
        m -= 1
    stack.append(x)
if m != 0:  # 만약에 m이 0이 되지 않았으면
    stck = stack[:-m]
res = ''.join(map(str, stack))
print(res)
