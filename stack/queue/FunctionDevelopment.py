# 진도가 100%일 때 서비스에 반영 가능
# 개발 속도 다름, 앞에 있는 기능보다 먼저 개발 될 수 있고, 이 때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됨
# 작업의 진도가 적힌 정수 배열:progresses
# 개발 속도가 적힌 정수 배열:speeds
# 각 배포마다 몇개의 기능이 배포 되는지를 return


# https://programmers.co.kr/questions/21121 참조
# https://huidea.tistory.com/15 참조
# https://seongonion.tistory.com/63
import math


def solution(progresses, speeds):

    # a는 progresses 이고 b는 speeds 가 된다
    progresses = [math.ceil((100 - a) / b) for a, b in zip(progresses, speeds)]
    # math.ceil의 경우 소수점 올림을 한다
    # [5,10,1,1,20,1]이 progresses 안으로 들어 오게 된다
    answer = []
    front = 0

    for idx in range(len(progresses)):  # 각 업무를 돈다
        if progresses[idx] > progresses[front]:
            answer.append(idx - front)
            front = idx
        answer.append(len(progresses) - front)
    return answer


progresses = [95, 90, 99, 99, 80, 99]
speeds = [1, 1, 1, 1, 1, 1]


print(solution(progresses, speeds))
