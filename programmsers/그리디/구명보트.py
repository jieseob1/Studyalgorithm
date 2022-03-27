def solution(people, limit):
    answer = 0
    people.sort()  # people 리스트 정렬
    i = 0
    j = len(people) - 1  # 리스트의 길이 -1을 j로 설정
    while i <= j:  # i가 j보다 작을때에만 계속 while문을 돈다.
        if people[i] + people[j] <= limit:  # limit를 아직 넘지 않았을 때
            i += 1
        j -= 1
        answer += 1  # answer는 count 부분

    return answer


people = [70, 50, 80, 50]
limit = 100
