n = int(input())  # 회의의 수
meeting = []
gloend, cnt = 0, 0

for _ in range(n):
    meeting.append(tuple(map(int, input().split())))
meeting.sort(key=lambda x: (x[1], x[0]))

print(meeting)
for start, end in meeting:
    if start >= gloend:  # 다음 회의 시작시간이 이전 회의 시작 시간보다 빠른 경우
        gloend = end
        cnt += 1
print(cnt)
