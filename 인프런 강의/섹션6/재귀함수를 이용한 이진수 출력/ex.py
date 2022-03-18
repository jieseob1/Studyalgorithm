# # 10진수 n이 입력시 2진수로 변환하여 출력하는 프로그램 -> 재귀 이용

# def dfs(x):
#     if x > 0:
#         div = x // 2
#         res = x % 2

#         dfs(div)
#         print(res, end=' ')


# n = int(input())  # 10진수 입력
# dfs(n)


def DFS(x):
    if x == 0:
        return
    else:
        print(x % 2, end=' ')
        DFS(x//2)


n = int(input())
DFS(n)
