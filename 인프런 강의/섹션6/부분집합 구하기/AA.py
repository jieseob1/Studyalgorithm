# 부분집합 구하기 DFS

def DFS(v):
    if v == n+1:  # 종료지점 -> 이때 출력해주면 도니다.
        for i in range(1, n+1):  # 1부터 n까지 도는데, 만약 ch의 i번째가 1이면 i를 출력시킨다
            if ch[i] == 1:
                print(i, end=' ')
        print()
    else:  # 아직종료지점 아님, 사용한다 사용하지 않겠다
        ch[v] = 1  # 사용한다. v라는 원소를 사용하겠다.
        DFS(v+1)
        ch[v] = 0
        DFS(v+1)


if __name__ == "__main__":
    n = int(input())
    ch = [0] * (n+1)  # [0,0,0,0]
    DFS(1)
