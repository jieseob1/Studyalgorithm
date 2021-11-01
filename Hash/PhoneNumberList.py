#hash 2단계

#한 번호가 다른 번호의 접두어인 경우가 있는지 확인
#어떤 번호가 다른 번호의 접두어인 경우가 있으면 flase
def solution(phone_book):
    #phone_book안에서 어떤 번호가 다른 번호의 접두어인지 아닌지를 확인한다
        answer = True
        phone_book.sort()
        for i in phone_book:
            if phone_book[i] in phone_book[i+1]:
                answer = False
        return answer