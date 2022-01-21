n, m = map(int, input().split())

a = []
largest = 0


def Count(len):
    # len은 mid가 들어간다
    cnt = 0
    for x in a:
        cnt += x // len
    return cnt


for _ in range(n):
    tmp = int(input())
    a.append(tmp)
    largest = max(largest, tmp)

lt = 1
rt = largest
res = 0
while lt <= rt:
    mid = (lt+rt) // 2

    if Count(mid) < m:  # 11개를 찾고 싶었는데 그거보다 작게 찾아진 경우-> 너무 크게 잘랐으니까 줄여야한다
        rt = mid - 1
    else:
        lt = mid + 1
        res = mid

print(res)
