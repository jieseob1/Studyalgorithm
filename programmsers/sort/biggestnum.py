from itertools import permutations
from re import T


def solution(numbers):
    input_list = list(map(str, numbers))
    print("input_list:", input_list)
    for x in input_list:
        print("x:", x * 3)
    input_list.sort(key=lambda x: x * 3, reverse=True)
    print("input_list:", input_list)

    return 0


numbers = [3, 30, 34, 5, 9]
print(solution(numbers))
