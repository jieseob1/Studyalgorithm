from collections import Counter


def solution(clothes):
    mycloth = []
    answer = 1

    for x in clothes:
        mycloth.append(x[1])
    clothes_cnt = Counter(mycloth)  # 이렇게 하면 headgear:2 eyewear:1로 된다.
    clothes_cnt = clothes_cnt.values()  # value만 받아온다음
    for x in clothes_cnt:  # 카운트를 돌면서
        answer *= (x+1)

    return answer-1
