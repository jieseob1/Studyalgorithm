n = int(input()) # 수의 개수
a = list(map(int,input().split())) # a1~ an까지
plus,minus, multiple, divide = map(int, input().split())

# 순열 => permutation => tlrks chrhk
# DFS를 이용해 최대 최솟값 => 연산자 갯수만큼 탐색 => 재귀호출
# 백트래킹