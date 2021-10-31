import sys
# https://www.acmicpc.net/problem/11399
# 백준 11399번 문제
# 사람은 1번부터 N번까지 번호가 매겨져 있으며, i번 사람이 돈을 인출하는데 걸리는 시간은 pi분

n = int(input())
# n은 사람의 수
# p는 돈을 인출하는데 걸리는 시간
p = list(map(int, input().split()))
p.sort()

num = 0

for i in range(n):
    for j in range(i+1):
        num += p[j]
        print("j:",j)
        print("num:",num)
# 돈을 인출하는데 필요한 시간의 합의 최솟값을 출력
