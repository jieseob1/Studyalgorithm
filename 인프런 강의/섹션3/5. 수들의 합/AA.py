# 부분 연속 수열
# 리스트가 있으면 왼쪽을 가리키는게 lt, 오른쪽을 가리키는게 rt라고 하자.
# 그리고 tot의 경우에는 a[0]를 현재 값으로 삼고 있다고 할때,
# lt부터 rt까지의 합은 lt부터 rt바로 전까지의 합으로 하게 된다.
# tot < m tot = m tot > m이렇게 3개를 분석한다.
# tot가 작으면 rt값이 커져야 하므로 rt를 1 증가시킨다.
# tot = m일때 cnt +=1을 한다 그리고 lt를 1을 증가시켜준다.

n, m = map(int, input().split())
a = list(map(int, input().split()))

lt = 0
rt = 1
tot = a[0]
cnt = 0
# lt는 왼쪽 인덱스 오른쪽은 rt인덱스를 가리킨다
while True:
    # 먼저 tot 기준으로 m보다 작을때 같을때 클때로 나눠주고,
    # 작을떄는 rt < n보다 작을때만 진행해주고 rt가 n보다 크거나 같아지게 되면 break로 아무것도 하지 않게 한다.
    if tot < m:
        if rt < n:  # rt가 n보다 작으면 tot에 rt값을 더해주고 rt는 1증가 시켜준다
            tot += a[rt]
            rt += 1
        else:
            break
    elif tot == m:
        cnt += 1
        tot -= a[lt]
        # tot가 m이랑 값이 같은경우에는 cnt를 1 올려주고, tot에서 lt인덱스에 해당하는 값을 빼준뒤, lt를 1을 더한다.
        lt += 1
    else:
        tot -= a[lt]
        lt += 1  # tot > m일 경우가 else인 부분이고 tot가 m보다 커지게 되면, tot에서 lt에 해당하는 값을 빼주고 lt를 1 더해준다
print(cnt)
