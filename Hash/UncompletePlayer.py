import  time
# 프로그래머스 Hash 1단계 문제- 효율성 10점,정확성 50점

#마라톤에 참여한 선수들의 이름participant
#완주한 선수들 이름 completion
#완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성

# participant에는 있지만 completion에는 없는 사람을 뽑아낸다 
start = time.time()
def solution(participant, completion):
    participant.sort()
    completion.sort()
    #먼저 sort를 한다 시간 복잡도 O(N)
    for i in completion:
        #완주자를 돌면서 PARTICIPANT에서 하나씩 없애준다.
        participant.remove(i)
    return participant[0]
    #가장 마지막 하나 남은게 정답


participant = ["marina", "josipa", "nikola", "vinko", "filipa"]
completion = ["josipa", "filipa", "marina", "nikola"]
print(solution(participant,completion))
print("time:",time.time() - start)