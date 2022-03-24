array = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]

for i in range(len(array)):
    min_index = i  # 가장 작은 원소의 인덱스
    print("min_index:", min_index)
    for j in range(i+1, len(array)):  # i+1부터 array의 길이만큼 돈다.
        # array의 min_index 부분이 더 크면 min_index를 바꿔준다.
        if array[min_index] > array[j]:
            min_index = j
            print("change min_index:", min_index)
        array[i], array[min_index] = array[min_index], array[i]  # 스와핑

print(array)
