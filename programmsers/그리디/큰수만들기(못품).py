def solution(number, k):  # 제거해야 할 숫자 갯수: k
    answer = []

    # for num in number:
    #     if not answer: # answer가 비어있다면
    #         answer.append(num) #answer에 num 추가
    #         continue
    #     if k > 0: #k > 0 이면
    #         while answer[-1] < num: #스택의 마지막 값이 push할 값(num)보다 작다면크거나 같을때 까지 값들에 대해서 pop하는 부분
    #             answer.pop()
    #             k -= 1 #제거해주는 부분(크거나 같은 값이 나올때까지 제거해주는 부분)
    #             if not answer or k <= 0: #answer가 아니거나 k가 0보다 작아지면
    #                 break # answer가 비어있거나 k가 0보다 작다면 break를 시켜준다.

    #     answer.append(num)
    # answer = answer[:-k] if k > 0 else answer
    # return ''.join(answer)
    for num in number:
        while k > 0 and answer and answer[-1] < num:
            answer.pop()
            k -= 1
        answer.append(num)
    return ''.join(answer[:len(answer) - k])


number = '1924'
k = 2
print(solution(number, k))
