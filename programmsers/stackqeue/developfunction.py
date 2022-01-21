#기능 개선 작업 수행
#진도가 100%일때 서비스에 반영 가능
#각 기능의 개발속도는 모두 다르므로, 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발 가능
#뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포
#progresses:작업의 진도가 적힌 정수 배열
#각 작업의 개발 속도가 적힌 정수 배열 speeds
#각 배포마다 몇 개의 기능이 배포되는지를 return
from collections import Counter

def solution(progresses, speeds):
    #100에서 progress 뺴고 speed 나누는게 걸리는 요일->이때 .ceil해서 올림 해주면 됨 
    answer = []
    for i in progresses:
        if i 

    return answer

progresses = [93, 30, 55]
speeds = [1,30,5]