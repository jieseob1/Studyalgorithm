def solution(name):
    answer = 0
    # 조이스틱 위,아래로 움직이는 케이스
    for alp in name:  # 각각의 알파벳을 돌면서
        answer += min(ord('Z') - ord(alp), ord(alp) - ord('A'))
    # 조이스틱 왼쪽, 오른쪽으로 움직이는 케이스

    return answer


name = 'JEROEN'
print(solution(name))
