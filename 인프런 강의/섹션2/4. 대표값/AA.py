n = int(input())  # 학생들
a = list(map(int, input().split()))  # n명 학생의 수학점수 리스트

sol = []
avg = round(sum(a)/n)
sum = 0
avgdiff = a[0]-avg

for index, value in enumerate(a):  # a의 index와 value값을 정한다.
    if avgdiff >= abs(value-avg):  # 만약 원래 avgdiff가 다른 것보다 크다면
        avgdiff = abs(value-avg)  # 최솟값 넣어주고
    if value == avgdiff+value:  # 만약에 같은 값을 가지고 있으면 안에 값을 넣지 않는다
        continue
    # 평균에 가장 가까운 점수가 여러개일 경우 먼저 점수가 높은 학생의 번호를 답으로하기 위해 리스트에 넣어준다
sol.sort(reverse=True)
print(sol)

print("%d %d" % (avg, sol[0]))

# 어렵
