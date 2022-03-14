
def solution(phone_book):
    answer = True
    hash = {}
    for phone_number in phone_book:
        hash[phone_number] = 1
        print("hash:", hash)
    for phone_number in phone_book:
        tmp = ''
        print("phone_number:", phone_number)
        for j in phone_number:
            tmp += j
            print("tmp:", tmp)
            if tmp in hash and tmp != phone_number:  # 만약 tmp가 hash에 들어는 있는데 tmp 가 phone_number와 같지 않다면
                answer = False
    print(answer)


solution(["123", "456", "789"])
