from itertools import combinations
import sys
n,k = map(int, input().split()) # 단어의 개수 n,k k개의 글자를 가르칠 시간 밖에 없다

# 나중에 다시 한번 풀어볼 것
# 남극 언어는 모두 anta로 시작 tica로 끝난다. 남극 언어에 단어는 N개 밖에 존재 안한다. 
#a,n,t,i,c => 총 5개를 알려주고,
answer = 0
first_word = {'a','n','t','i','c'}

# 백트래킹
remain_alphabet = set(chr(i) for i in range(97,123)) - first_word
data = [sys.stdin.readline().rstrip()[4:-4] for _ in range(n)]
def countReadableWords(data, learned): # 읽을수 있는 단어들
    cnt = 0
    for word in data: # antic를 제외한 data 를 돌면서
        canRead = 1 # true
        for w in word: #
          # 안배웠으니까 못읽는다.
            if learned[ord(w)] == 0: # 아직 안배웠으면
                canRead = 0  # 못읽는다
                break
        if canRead == 1: # 읽을 수 있는 것들에 대해서 cnt를 더해주고
            cnt += 1
    return cnt

if k >= 5: # k가 5 이상일떄만
    learned = [0] * 123 
    for x in first_word:
        learned[ord(x)] = 1 # 읽을 수 있는 부분들에 대한 것만 체크한다. 

   # 남은 알파벳 중에서 k-5개를 선택해본다.
    print("list(combinations(remain_alphabet, k-5)):",remain_alphabet) # a,n,t,i,c를 제외한 나머지 알파벳들
    print("list(combinations(remain_alphabet, k-5)):",list(combinations(remain_alphabet, k-5)))
    for teach in list(combinations(remain_alphabet, k-5)):# 남아있는 알파벳들을 조합한다.
        print("teach:",teach)
        for t in teach: # 조합한 것들을 돌면서
            learned[ord(t)] = 1 # 해당하는 값을 1로 설정해주고
        cnt = countReadableWords(data, learned) # 배운것들 

        if cnt > answer:
            answer = cnt # max인 부분 찾기 위해 갱신
        for t in teach: # 다음 경우의 수를 판단할 때 사용하기 위해 다시 0으로 바꿔준다.
            learned[ord(t)] = 0
    print(answer)

else:
    print(0)

    
        
    