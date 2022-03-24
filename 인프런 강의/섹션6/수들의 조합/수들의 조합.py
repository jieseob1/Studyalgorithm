def dfs(L, start, sum):  # s는 시작하는 부분
    global cnt
    if L == k:
        if sum % m == 0:  # 배수라면
            cnt += 1
    else:
        for i in range(start, n):  # 처음에는 n-1까지 돌아야 한다.
            dfs(L+1, i+1, sum + data[i])

# sum +data[i]를 더해줘야한다.


n, k = map(int, input().split())
data = list(map(int, input().split()))  # n개의 정수
m = int(input())
cnt = 0
dfs(0, 0, 0)
print(cnt)
# 정수 m의 배수인 개수는 몇가지
# n개의 정숙 ㅏ주어지면 그 숫자들 중 K개를 뽑는 조합의 합이 임의의 정수 M인 배수인 개수는 몇 개가 있는 지출력


# 나의 아이디어: 조합의 합을 모두 넣고 set을 사용하여 set의 길이를 나타내면 된다.
# 조합은 위에 처럼 dfs를 통해 나타낸다.
