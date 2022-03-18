def solution(n, lost, reserve):
    new_reserve = [r for r in reserve if r not in lost]
    new_lost = [l for l in lost if l not in reserve]
    answer = len(new_reserve)
    for i in new_reserve:  # 여벌 가지고 있는 사람을 돌면서
        lf = i-1
        rg = i+1
        if lf in lost:
            new_lost.remove(lf)
        if rg in lost:
            new_lost.remove(rg)
    return answer - len(new_lost)


n = 5
lost = [2, 4]
reserve = [1, 3, 5]
print(solution(n, lost, reserve))
