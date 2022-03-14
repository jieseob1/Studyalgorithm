from collections import deque


def solution(begin, target, words):
    answer = 0
    q = deque()
    # q를 deque로 선언
    q.append([begin, 0])
    #큐에 [begin,0]을 추가해준다.
    V = [0 for i in range(len(words))] # words의 길이만큼 V에 0을 넣어준다.
    while q:  # q가 빌때까지 반복한다.
        word, cnt = q.popleft()
        #word는 begin이 되고, cnt는 0이 된다.
        if word == target: #만약 word가 target이랑 같아진다면
            answer = cnt #cnt를 answer에다가 넣고 break 시킨다.
            break
        for i in range(len(words)): # words의 길이만큼 돈다.
            temp_cnt = 0 #일시적으로 카운트 해주는 변수를 선언하고
            if not V[i]: # V[i]가 아니라면
                for j in range(len(word)): # 단어의 알파벳을 돌면서
                    if word[j] != words[i][j]: #같지않다면
                        temp_cnt += 1 # temp_cnt를 더해준다.
                    if temp_cnt == 1: #만약 1이 된다면
                        q.append([words[i], cnt+1]) #q에다가 append 해준다.
                        V[i] = 1

    return answer
