arr = [7,5,9,0,3,1,6,2,9,1,4,8,0,5,2]

count = [0] * (max(arr) + 1) #arr에서의 최대 크기에서 1더한것


for i in range(len(arr)): #배열의 크기만큼 돈다.
    count[arr[i]] += 1 #count 배열에 계수의 갯수만큼 더해준다.
for i in range(len(count)): #리스트에 기로고딘 정렬 정보 확인
    for j in range(count[i]):
        print(i, end=' ') #띄어쓰기를 구분으로 등장한 횟수만큼 인덱스 출력
print(count)