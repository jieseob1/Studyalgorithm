def solution(name):
    answer = 0
    min_left_right = len(name)  # 왼쪽에서 오른쪽으로만 이동할 때 좌,우 조작 횟수
    next_idx = 0
    for idx, char in enumerate(name):
        # 위, 아래 조작 횟수의 최솟값 구하기
        answer += min(ord(char) - ord('A'), ord('Z') - ord(char) + 1)

        # 좌, 우 조작 횟수의 최솟값 구하기
        next_idx = idx + 1
        # 다음 인덱스가 name의 길이보다 작고 다음 문자열이 A이면
        while next_idx < len(name) and name[next_idx] == 'A':
            next_idx += 1  # 현재 위치 이후 연속된 A 다음의 문자를 가리킴

        # 한 방향으로만 이동하는 경우와, 오른쪽으로 이동했다가 왼쪽으로 이동하는 경우를 비교 next_idx를 옮기고 나서 왼쪽으로 가는게 유리한지 오른쪽으로 가는게 유리한지 판단하게 된다.
        min_left_right = min(min_left_right, idx + idx + len(name) - next_idx)
        # 계속 체킹해주는 역할
    answer += min_left_right
    print(answer)


name = "JERONE"
solution(name)
