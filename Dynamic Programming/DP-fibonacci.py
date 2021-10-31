# 배열 초기화
array = [0] * 200


def fibo(x):
    if x == 1 or x == 2:
        return 1
    if array[x] != 0: #만약 특정 부분이 존재하는 경우
        return array[x] # 특정 부분을 return 시켜준다
    array[x] = fibo(x - 1) + fibo(x - 2)
    return array[x]


print(fibo(199))

