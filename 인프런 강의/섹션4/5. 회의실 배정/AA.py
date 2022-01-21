n = int(input())
a = []

for _ in range(n):
    tmp = map(int, input().split())
    tmp = tuple(tmp)
    a.append(tmp)

a.sort(key=lambda x: (x[1], x[0]))  # 끝나는 시간 기준으로 정렬

for s, e in a:
    print("s:", s)
    print("e:", e)
