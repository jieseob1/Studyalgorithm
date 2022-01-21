import sys
T = int(input())

for t in range(T):
    N, s, e, k = map(int, input().split())
    listOfN = list(map(int, input().split()))
    listOfN = listOfN[s-1:e]
    listOfN.sort()
    print("#%d %d" % (t+1, listOfN[k-1]))
