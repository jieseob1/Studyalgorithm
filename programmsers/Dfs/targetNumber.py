from ctypes.wintypes import tagRECT


def solution(numbers, target):
    answer = 0

    def DFS(L, sum):
        if L == len(numbers):
            if sum == target:  # 만약 L의 길이가 numbers의 길이에 도달하고 sum이 target과 같아진다면
                nonlocal answer
                answer += 1  # answer에 1을 더해준다.
        else:
            DFS(L+1, sum + numbers[L])
            DFS(L+1, sum - numbers[L])
    DFS(0, 0)
    return answer


numbers = [1, 1, 1, 1, 1]
target = 3

print(solution(numbers, target))
