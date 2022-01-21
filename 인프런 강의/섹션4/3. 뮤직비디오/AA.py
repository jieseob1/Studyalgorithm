n, m = map(int, input().split())
a = list(map(int, input().split()))


def Count(len):
    cnt = 1
    sum = 0
    for x in a:
        if sum + x > len:  # 만약 len을 초과하게 되면
            cnt += 1  # cnt를 더해주고
            sum = x  # sum은 x로 다시 바꿔준다
        else:
            sum += x
    return cnt


lt = 1
rt = sum(a)
res = 0

while lt <= rt:
    mid = (lt + rt) // 2
    if Count(mid) > m:  # 만약에 너무 짧게 잘랐다면, mid가 엄청 짧은거니까
        lt = mid + 1
    else:
        rt = mid - 1
        res = mid
print(res)
