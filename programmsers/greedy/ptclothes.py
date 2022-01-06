def solution(n, lost, reserve):
    # n 전체 학생수, lost:체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복 가져온 학생들의 번호가 담신배열 reserve
    # lost에 없는 reserve만 my_reserve에 넣는다
    my_reserve = [r for r in reserve if r not in lost]
    my_lost = [l for l in lost if l not in reserve]  # 같이 겹치는 부분은 일단 모두 제거

    for r in my_reserve:  # 현재 체육복이 있는 학생들 중에서
        if (r-1) in my_lost:
            my_lost.remove(r-1)
        elif (r+1) in my_lost:
            my_lost.remove(r+1)

    return n-len(my_lost)
# 85점 test3,5,12 실패


n = 5
lost = [2, 4]
reserve = [3]

print(solution(n, lost, reserve))
#
