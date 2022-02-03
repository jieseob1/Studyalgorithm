from itertools import permutations


def solution(numbers):
    answer = ''
    per = list(permutations(numbers, len(numbers)))
    new_per = ["".join(map(str, i)) for i in per]  # 이거 중요

    return max(new_per)


numbers = [3, 30, 34, 5, 9]
print(solution(numbers))
