
def DFS(L, sum):  # sum은 내가 만든 부분집합의 합
    # L은 인덱스 번호 또한 level의 의미도 가지고 있다.
    if sum > total // 2:  # 합이 같아야 하는데 커지게 되어버리면 의미가 없어지므로
        return -1
    if L == n:  # 0번 인덱스부터 해서 n까지 가면 종료지점이 도니다.
        if sum == (total-sum):  # 선택되지 않은 또다른 부분집합과 값이 같으면
            print("YES")
            return -1
    else:
        DFS(L+1, sum+a[L])  # 두갈래로 호출하면 된다
        DFS(L+1, sum)  # 그전값 그대로 가겠다.


if __name__ == "__main__":
    n = int(input())  # 자연수 n
    a = list(map(int, input().split()))
    # 각 원소를 부분집합에 포함한다 포함하지 않는다로 정해서 총 2^n-1개(공집합 제외)의 경우가 나올 수 있도록 한다.
    # 하나의 부분집합을 만들었다면,나머지는 알아서 부분집합이 만들어진다.
    # total - sum을 해주면 된다.
    total = sum(a)  # a의 총합
    DFS(0, 0)
    print("No")
