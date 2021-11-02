import  time
# 프로그래머스 Hash 1단계 문제- 효율성 10점,정확성 50점

#마라톤에 참여한 선수들의 이름participant
#완주한 선수들 이름 completion
#완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성

# participant에는 있지만 completion에는 없는 사람을 뽑아낸다 
start = time.time()
def solution(participant, completion):
    part = {}
    comp = {}
    answer = ''
    for i in participant:
        part= i
        print("part:",part)
    for i in completion:
        comp = i
        print("comp:",comp)
    
    for i in comp:
       del part
    print ("answer:",part)
    return part
    #가장 마지막 하나 남은게 정답

#     participant.sort()
#     completion.sort()
#     for part,comp in zip(participant, completion):
#         if part != comp:
#             return part

#     return participant[-1]

#  answer = collections.Counter(participant) - collections.Counter(completion)
#     return list(answer.keys())[0]


#  dict = {}
#     for name in participant:
#         if dict.get(name):
#             dict[name] += 1
#         else:
#             dict[name] = 1

#     for name in completion:
#         dict[name] -= 1

#     for key in dict:
#         if dict[key] > 0:
#             return key
participant = ["marina", "josipa", "nikola", "vinko", "filipa"]
completion = ["josipa", "filipa", "marina", "nikola"]
print(solution(participant,completion))
print("time:",time.time() - start)