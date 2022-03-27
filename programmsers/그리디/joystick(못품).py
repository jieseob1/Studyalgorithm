def solution(name):
    answer = 0
    # 이름의 길이 만큼 -> 왼쪽에서 오른쪽으로만 이동할 때, 좌,우 조작 횟수를 의미한다.
    min_left_right = len(name)
    next_idx = 0  # 다음번 인덱스는 0이다.
    for idx, char in enumerate(name):  # name을 enumerate하게 돌면서
        # 조이스틱 위,아래로 움직이는 케이스
        answer += min(ord(char) - ord('A'), ord('Z') - ord(char) + 1)
        # 좌,우 조작 횟수의 최솟값 구하기 51
        next_idx = idx + 1  # for문을 돌때마다 다음 index로 넘어간다.
        while next_idx < len(name) and name[next_idx] == "A":
            # 다음 인덱스에 해당하는 글자가 a이고 다음 인덱스가 name의 길이보다 작은 경우
            next_idx += 1  # 현재 위치 이후 연속된 a 다음의 문자를 가리킨다.
        min_left_right = min(min_left_right, idx + idx + len(name) - next_idx)
    answer += min_left_right
    return answer


name = 'JEROEN'
print(solution(name))
