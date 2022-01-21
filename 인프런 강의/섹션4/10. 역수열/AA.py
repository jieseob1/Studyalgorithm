n = int(input())
a = list(map(int, input().split()))
# [5 3 4 0 2 1 1 0]
seq = [0]*n  # [0,0,0,0,0,0,0]

for i in range(n):
    for j in range(n):  # j가 seq탐색
        if a[i] == 0 and seq[j] == 0:
            seq[j] = i+1
            break
        elif seq[j] == 0:
            a[i] -= 1
print(seq)


# 이거 꼭 다시 해보기
