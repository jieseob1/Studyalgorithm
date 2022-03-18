# # c킬로그램을 넘을 수 없는 트럭
# # c를 넘지 않으면서 바둑이들을 가장 무겁게 태우고 싶다.

# def dfs(L, sum):
#     global res
#     if sum > c:  # c를 넘어버리면 그냥 끝내버림
#         return
#     if L == n:  # dfs가 모두 돌았을 때
#         if sum < res:  # max가 더 큰 경우
#             print(res)
#         else:
#             return
#     else:
#         res = max(res, sum)
#         dfs(L+1, sum + data[L])  # 더한거랑
#         dfs(L+1, sum)  # 안더한거


# 선생님 강의 -부분집합을 사용하자

def dfs(L, sum):
    global res
    if sum > c:
        return
    if L == n:
        # 이 부분이 중요함
        if sum > res:
            res = sum
    else:
        dfs(L+1, sum + data[L])
        dfs(L+1, sum)


c, n = map(int, input().split())
data = [0] * (n)
res = -2147000000
for i in range(n):
    data[i] = int(input())
dfs(0, 0)
print(res)
