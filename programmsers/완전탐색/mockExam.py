def solution(answers):
    answer = []
    # 수포자 3인방이 모의고사 수학 문제를 찍는 방식
    list1 = [1, 2, 3, 4, 5]
    list2 = [2, 1, 2, 3, 2, 4, 2, 5]
    list3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    cnt1 = 0
    cnt2 = 0
    cnt3 = 0

    for i in range(len(answers)):
        s1 = i % 5
        s2 = i % 8
        s3 = i % 10

        if list1[s1] == answers[i]:
            cnt1 += 1
        if list2[s2] == answers[i]:
            cnt2 += 1
        if list3[s3] == answers[i]:
            cnt3 += 1
    if max(cnt1, cnt2, cnt3) == cnt1:
        answer.append(1)
    if max(cnt1, cnt2, cnt3) == cnt2:
        answer.append(2)
    if max(cnt1, cnt2, cnt3) == cnt3:
        answer.append(3)

    return answer


answers = [1, 3, 2, 4, 2]
print(solution(answers))
