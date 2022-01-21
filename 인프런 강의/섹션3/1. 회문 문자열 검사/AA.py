# 회문 문자열 검색
n = int(input())  # n개 문자열 데이터 입력

for j in range(n):
    word = input().lower()  # n개 단어 입력 부분
    discrim = ''
    rev_word = word[::-1]
    rev_word = rev_word.lower()
    for i in word:
        if word == rev_word:
            discrim = "YES"
        else:
            discrim = 'NO'
    print('#%d %s' % (j+1, discrim))
