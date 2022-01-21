n = int(input())
a = list(map(int, input().split()))

lt = 0
rt = n-1
last = 0
res = ""  # left,right 저장하기 위해서 문자열을 res에 넣는다.
tmp = []  # 두개를 넣어서 정렬할 빅 리스트
while lt <= rt:
    # lt의 자료값과 rt의 자료값이 last보다는 커야지 수열의 항이 될 수 있다.
    if a[lt] > last:  # a가 last보다 크다면
        tmp.append((a[lt], "L"))
    if a[rt] > last:
        tmp.append((a[rt], "R"))

    # 이렇게 되면 last보다 크다면 2개가 들어올 수 있다.
    # 첫번째에는 2,3이 tmp에 들어오게 된다.
    tmp.sort()  # 튜플의 첫 자료를 기준으로 정렬한다.
    # tmp를 정렬하게 되면 2L과 3R이 들어오게 된다.
    if len(tmp) == 0:
        break  # tmp의 길이가 0이 된다면 break를 통해서 while문을 빠져나오게 되고
    else:  # tmp의 길이가 0이 아니라면
        res = res+tmp[0][1]  # res는 문자열을 적기 위함 2개중에 작은수가 index 0번째에 오게 된다
        last = tmp[0][0]  # 2,3중 작은 수를 last로 만들어준다
        if tmp[0][1] == 'L':
            lt += 1
        else:
            rt -= 1
    tmp.clear()
print(len(res))
print(res)
