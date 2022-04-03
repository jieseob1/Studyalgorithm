def solution(phone_book):
    answer = True 
    phone_book.sort() #먼저 sorting을 진행해준다.
    
    #startswith을 사용할 것이다
    for i in range(len(phone_book) - 1): # phone_book의 크기만큼 돈다
        if phone_book[i+1].startswith(phone_book[i]):
            return False
    return answer


solution(["123", "456", "789"])
