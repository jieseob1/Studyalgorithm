n = int(input())  # N시에 대한 정보
timecnt = 0
threecount = 0
for k in range(n+1):
    for i in range(60):  # 분
        for j in range(60):  # 초
            if '3' in str(j) + str(i) + str(k):  # 이부분 주의
                threecount += 1
print(threecount)
