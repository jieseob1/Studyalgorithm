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
# https://mong9data.tistory.com/29

def solution(priorities, location):
    answer = 0

    printer_list = [(i, p) for i, p in enumerate(priorities)]  # queue로 진행할 예정

    print("printer_list", printer_list)

    print("printer_list:", printer_list)

    # printer_list.append(i)  # fifo로 넣어준다
    # [1,1,9,1,1,1] 이런상태로 들어갈 예정

    tmp_key, tmp_value = printer_list.pop(0)
    print("printer_list:", printer_list)
    print("tmp key and value:", tmp_key, tmp_value)
    return answer


priorities = [1, 2, 3, 4, 5]
location = 0

print(solution(priorities, location))
