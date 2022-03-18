import sys


def dfs(L, sum):
    # L: level이란는 의미도 존재한다.
    if sum > total//2:  # 이미 하나의 부분집합 합이 같아질 경우가 없어지므로 끝내버린다.
        return
    if L == n:  # 끝까지 갔을 때
        if sum == (total-sum):
            print("YES")
            sys.exit(0)
    else:
        dfs(L+1, sum+data[L])
        dfs(L+1, sum)


n = int(input())
data = list(map(int, input().split()))
total = sum(data)
dfs(0, 0)
print("No")
# 6개에 대한 부분집합   을 모두 만든다.-> 총 63개이고, sum을 통해서 나타내게 된다.
# 전체 원소의 합을 total이라고 하고, 부분집합의 합을 sum을 한뒤 total-sum값이 같으면 tes 출력
