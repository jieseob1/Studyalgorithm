from itertools import permutations


def solution(numbers):
    answer = []
    nums = list(n for n in numbers)  # numbers를 하나씩 자른 거
    # 17인 경우에는 1과 7이 들어가게 된다
    print("nums:", nums)
    per = []
    for i in range(1, len(numbers) + 1):  # 1부터 numbers의 길이만큼 돌면서 순열로 만든다
        per.extend(list(permutations(nums, i)))
        print("per:", per)
    new_nums = [int(("").join(p)) for p in per]   # 각 순열조합을 하나의 int형 숫자로 변환
    print("new_nums:", new_nums)
    for n in new_nums:                            # 모든 int형 숫자에 대해 소수인지 판별
        if n < 2:  # 2보다 작은 1,0의 경우 소수 아님
            continue  # 그냥 넘어간다
        check = True  # check를 true로 하고
        for i in range(2, int(n**0.5) + 1):  # n의 제곱근 보다 작은 숫자까지만 나눗셈
            if n % i == 0:  # 소수가 아님 따라서 check를 False로 한다                    # 하나라도 나눠떨어진다면 소수 아님!
                check = False
                break
        if check:  # check가 true이게 되면
            answer.append(n)                      # 소수일경우 answer 배열에 추가
    print("answer set:", set(answer))
    return len(set(answer))  # set을 통한 중복 제거 후 반환


numbers = "17"
print(solution(numbers))
