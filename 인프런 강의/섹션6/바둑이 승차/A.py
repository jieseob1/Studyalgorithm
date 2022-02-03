# 부분집합이라고 생각해서 만든다.
def DFS(L, sum):
    global res
    if sum > c:
        return
    if L == n:  # L a라는 인덱스를 접근하는 인덱스 번호
        # 종착점에 도착, 부분집합 하나가 완성되었다.
        if sum > res:
            res = sum  # 이렇게 res를 재할당을 하게 되며 로컬변수가 되어버린다.
            # 따라서 다시 초기화를 해줘야 한다.
    else:  # 부분집합이 뻗어나간다.
        DFS(L+1, sum+a[L])
        DFS(L+1, sum)


if __name__ == "__main__":
    c, n = map(int, input().split())  # 자연수 c와 n이 주어짐
    a = [0] * n  # 바둑이 각각의 무게를 여기다 넣어놓을꺼임
    res = 0  # 가장 큰값을 여기다가 넣어놓고 저장할예정
    for i in range(n):
        a[i] = int(input())
    DFS(0, 0)
