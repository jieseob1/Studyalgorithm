from itertools import permutations


def isPrime(number):
    if number == 0 or number == 1:
        return False
    for i in range(2, number):
        if number % i == 0:
            return False
    return True


def solution(numbers):
    answer = []
    per = []  # 순열을 넣는다
    nums = [n for n in numbers]  # ["1","7"]
    for x in range(1, len(nums)+1):
        per += list(permutations(nums, x))
    new_nums = list(map(int, map("".join, per)))  # [1,7,17,71]
    for n in new_nums:  # 소수 찾을 거임
        if isPrime(n):
            answer.append(n)
    return len(set(answer))
