#hash 2단계

#한 번호가 다른 번호의 접두어인 경우가 있는지 확인
#어떤 번호가 다른 번호의 접두어인 경우가 있으면 flase
def solution(phone_book):
    #포함여부는 두가지를 사용 할수 있다.- (1)in not in,(2)startswith
    answer = True 
    phone_book.sort() #먼저 sorting을 진행해준다.
    
    #startswith을 사용할 것이다
    for i in range(len(phone_book) - 1): # phone_book의 크기만큼 돈다
        if phone_book[i+1].startswith(phone_book[i]):
            return False
    return answer
#테스트 13번 아직 통과 못함

phone_book = ["119", "97674223", "1195524421"]

print(solution(phone_book))