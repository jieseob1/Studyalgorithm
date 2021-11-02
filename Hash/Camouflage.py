# 스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질때,
# 서로 다른 옷의 조합의 수를 return
# 스파이는 하루에 최소 한개의 의상은 입는다.
from collections import Counter


def solution(clothes):
    for cloth in clothes:
        key = cloth[0]
        value = cloth[1]

    print(Counter(list(clothes)))
    answer = 0  # 조합이 가능한 옷가지 수
    return answer


clothes = [["yellowhat", "headgear"], [
    "bluesunglasses", "eyewear"], ["green_turban", "headgear"]]

print(solution(clothes))


# https://velog.io/@minidoo/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%ED%95%B4%EC%8B%9CHash-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-2%EB%8B%A8%EA%B3%84-%EC%9C%84%EC%9E%A5
