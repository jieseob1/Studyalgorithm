arr = [7,5,9,0,3,1,6,2,4,8]

for i in range(len(arr) - 1):
        min_idx = i  # 최소 인덱스를 for문을 써서 계속 바꾼다.
        for j in range(i + 1, len(arr)): # 최소인덱스 다음부터
            if arr[j] < arr[min_idx]: # 0번째 인덱스를 뽑아서 
                min_idx = j # min_idx=1로 바꾼다. 
                print("min_idx:",min_idx)
        print()
        arr[i], arr[min_idx] = arr[min_idx], arr[i] 
        print(arr)
print(arr)

# 시간 복잡도 O(n^2)