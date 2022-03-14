def solution(answers):
    number1 = [1, 2, 3, 4, 5]
    number2 = [2, 1, 2, 3, 2, 4, 2, 5]
    number3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    cnt1, cnt2, cnt3 = 0, 0, 0
    res = []
    for x in range(len(answers)):
        if answers[x] == number1[x % 5]:
            cnt1 += 1
        if answers[x] == number2[x % 8]:
            cnt2 += 1
        if answers[x] == number3[x % 10]:
            cnt3 += 1
    answer_temp = [cnt1, cnt2, cnt3]

    for person, value in enumerate(answer_temp):  # value-> cnt1,2,3
        if value == max(answer_temp):
            res.append(person+1)

    return res


answers = [1, 2, 3, 4, 5]

print(solution(answers))
