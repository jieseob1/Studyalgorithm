from turtle import speed


def solution(progresses, speeds):
    answer = []
    time = 0
    cnt = 0
    while progresses:  # pop을 이용할 예정
        time += 1
        print("progresses:", progresses)
        print(time)
        print(speeds[0]*time)
        if(progresses[0] + speeds[0]*time >= 100):
            progresses.pop(0)
            speeds.pop(0)
            cnt += 1
        else:
            if cnt > 0:
                answer.append(cnt)
                cnt = 0
    answer.append(cnt)
    return answer


progresses = [93, 30, 55]
speeds = [1, 30, 5]

print(solution(progresses, speeds))
