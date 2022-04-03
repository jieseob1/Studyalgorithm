def solution(s):
    answer = len(s) #1.전달받은 매개변수 문자열 s의 길이를 구하여 answer에 할당
    for step in range(1, len(s) // 2 + 1):
        #1개 단위(step)부터 압축 단위를 늘려가며 확인한다.
        compressed= ''
        #0번째부터 step만큼의 문자열 추출 -> step 크기만큼 증가시키며 이전 문자열과 비교한다.
        prev = s[0:step] #앞에서부터 step만큼의 문자열을 추출한다.
        count = 1

        #단위(step)크기만큼 증가시키며 이전 문자열과 비교한다.
        for j in range(step, len(s), step):
            #이전 상태와 동일하다면 압축 횟수 증가
            if prev == s[j:j+step]:
                count += 1
            else:
                #이전 상태와 동일하지 않은 경우
                compressed += str(count) + prev if count >= 2 else prev
                prev = s[j:j+step]
                count = 1
        compressed += str(count) + prev if count >= 2 else prev
        answer = min(answer, len(compressed))
    return answer

s ="aabbaccc"	
print(solution(s))