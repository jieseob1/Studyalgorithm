n = int(input())

if n % 5 == 0:  # 5으로 나눠떨어질 때
    print(n // 5)
else:  # 5로 나누어 떨어지지 않을 때
    p = 0
    while n > 0:
        n -= 3  # 3kg을 뺴주고
        p += 1  # count를 1 증가 시킨다.
        if n % 5 == 0:  # 3kg과 5kg를 조합해서 담을 수 있을 때
            p += n // 5
            print(p)
            break
        elif n == 1 or n == 2:  # 설탕 봉지만으로 나눌 수 없을 때
            print(-1)
            break
        elif n == 0:  # 3으로 나눠떨어질 때
            print(p)
            break
