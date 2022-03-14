# 내가 푼 풀이
n, m = map(int, input().split())
a = []
temp_list = []
for _ in range(n):  # n번만큼 반복
    a.append(list(map(int, input().split())))
for i in range(n):
    temp_list.append(min(a[i]))
print(max(temp_list))


# result = 0
# for i in range:
#     data = list(map(int, input().split()))
#     min_value = min(data) # data의 최솟값을 min_value에 넣고
#     result = max(result,min_value) #result와 min_value의 결과 비교
