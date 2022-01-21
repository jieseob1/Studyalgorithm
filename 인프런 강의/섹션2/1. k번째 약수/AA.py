
N, K = list(map(int, input().split()))  # N,K가지고 옴


def solution(n, k):
    cnt = 0
    for i in range(1, n+1):
        if n % i == 0:  # K가 N의 약수이면
            cnt += 1
        if cnt == k:
            print(i)
    else:
        print(-1)


print(solution(N, K))
