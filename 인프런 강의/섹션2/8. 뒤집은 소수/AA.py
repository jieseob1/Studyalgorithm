# 뒤집은 소수
# n개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒵은 수가 소수이면, 그 수를 출력하는 프로그램
n = int(input())
a = map(int, input().split())

# 'int' object is not subscriptable
# 정수형이여야 하는데, 문자열이나 리스트일 때 인덱싱하는 것처럼 사용될 때 나옴


def reverse(x):
    # 뒤집는 함수 0은 제거-int면 알아서 제거
    x = str(x)
    rev = x[::-1]
    # 이 슬라이싱 부분 좀 더 공부하자
    rev = int(rev)
    return rev


def isPrime(x):
    x = reverse(x)
    for i in range(2, x):
        if x % i == 0:  # 23이 2,3,4~~i-1로 나눈 나머지가 0이 아니면 즉, 나누어 떨어지지 않으면
            return False
        res = x
    print(res, end=' ')


for i in a:
    isPrime(i)
