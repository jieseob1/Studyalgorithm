for i in range(2, 10):
    for j in range(2, 9):
        if i % j == 0:  # 만약 i로 떨어지는게 있으면
            break
    print(i)
