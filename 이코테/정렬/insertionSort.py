arr = [7,5,9,0,3,1,6,2,4,8]

for i in range(1, len(arr)):
    for j in range(i,0,-1): # 인덱스 i부터 1씩 감소
        if arr[j] < arr[j-1]: # 한 칸씩 왼쪽으로 이동
            arr[j], arr[j-1] = arr[j-1],arr[j]
        else:
            break
print(arr) 
            