from itertools import permutations
import math


def isPrime(number):  # 숫자를 넣어서 만약 소수이면 True, 아닌 경우에는 False를 return 한다.
    if number < 2:  # number가 2보다 작다면
        return False
    for i in range(2, int(math.sqrt(number)) + 1):  # math.sqrt를 사용하여 루트를 씌운다.
        if number % i == 0:  # 특정 숫자가 i로 나누어 떨어지게 된다면
            return False
    return True


def solution(numbers):
    numberList = []
    per = []  # 순열 넣는 부분
    res = []
    for i in numbers:
        numberList.append(i)
    for i in range(1, len(numberList)+1):
        per += (list(map(''.join, permutations(numberList, i))))
    for i in per:
        # isPrime 함수에 들어가서 이 부분이 소수인지 아닌지를 판별하고 마는 경우에는 res 리스트에 넣어준다.
        if isPrime(int(i)):
            res.append(int(i))
    return set(res)


numbers = "011"  # 문자열
print(solution(numbers))
