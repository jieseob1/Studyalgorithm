# 프린터 인쇄 요청이 들어온 순서대로 인쇄-중요한 문서 나중에 인쇄
# 중요도가 높은 문서를 먼저 인쇄하는 프린터 개발

# 1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
# 2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
# 3. 그렇지 않으면 J를 인쇄합니다. ->heap으로 푼다 중요도가 제일 높은게 있으면 문서(J)를 pop(0)한뒤 다시 append 시켜준다

# priorities:문서의 중요도가 순서대로 담긴 배열
# location:인쇄를 요청한 문서가 현재 대기목록의 어떤 위치에 있는지를 알려줌

# https://programmers.co.kr/questions/20063
# 풀이 방식-> 딕셔너리를 이용하여 index를 사용하여 문제를 풀어간다
# https://itholic.github.io/kata-printer/
# https://mong9data.tistory.com/29 -> 다른 list들 2개를 더 만들어서 max,index등을 써서 구현
# 11월 11일날 마저 공부하고 정리하고 끝내기

def solution(priorities, location):
    printer_list = [(index, priority) for index, priority in enumerate(
        priorities)]  # ()로 index, priority 를 묶어서 만들어야 한다
    # printer_list에 index,prioirty 같이 넣어준다
    answer = 0
    # 다른 배열들을 만들어 준다: 대기하는 부분이랑 final_printer_list랑 pop한 부분을 넣어줄 수 있는 변수 이렇게 3개가 필요하다
    final_printer_list = []

    # 나중에 final_printer_list로 모두 옮겨 줄꺼기 때문에 printer_list가 0이 될때까지 계속 while문으로 돌게 된다.
    while printer_list:
        tmp_value = printer_list.pop(0)  # 먼저 pop을 통해 제일 먼저 값을 빼준다
        waiting_list = [priority
                        for index, priority in printer_list]
        # pop을 뺀 나머지 부분을 waiting_list에 넣어준다
        if waiting_list:  # waiting_list가 빌때까지
            max_prior = max(waiting_list)
        # waiting_list에 들어간 거 중에 제일 max 부분을 빼서 tmp_value[1]과 비교해준다
        if tmp_value[1] >= max_prior:  # 만약 내가 뺀 부분이 다른 우선 순위보다 높은 경우
            # 가장 높은 우선 순위부터 넣어줄 예정- 어차피 index 값이 들어가 있으므로 그에 맞는 location 값을 찾아낼 수 있다.
            final_printer_list.append(tmp_value)
        else:
            printer_list.append(tmp_value)
        # 이렇게 하면 final_printer_list가 모두 우선순위별로 정의가 될것이고
    for index, prior in enumerate(final_printer_list):
        print("prior[0]:", prior)
        if prior[0] == location:
            answer = index + 1

    return answer


priorities = [1, 1, 9, 1, 1, 1]
location = 0

print(solution(priorities, location))
