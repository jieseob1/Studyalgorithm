n = int(input())  # 지원자의 수
# application_list = []
# for i in range(n):
#     height, weight = map(int, input().split())
#     application_list.append((height, weight))
# # 키와 몸무게가 둘다 지면 뽑지 않는다.
# # 일대일 비교, 키와 몸무게 중 적어도 하나는 크거나, 무거운 지원자

# application_list.sort(reverse=True, key=lambda x: (x[0], x[1]))  # 무거운 순으로 정렬
# first_weight = application_list[0][1]
# first_height = application_list[0][0]
# cnt = 1
# for height, weight in application_list:
#     if weight > first_weight:  # 몸무게가 더 크다면
#         cnt += 1  # 카운팅을 해주고
#         first_weight = weight  # 몸무게를 바꿔서 다시 진행한다

# print(cnt)

# # 이부분은 문제 이해가 중요함
body = []
for i in range(n):
    a, b = map(int, input().split())
    body.append((a, b))
body.sort(reverse=True)
largest = 0
cnt = 0
for x, y in body:
    if y > largest:
        largest = y
        cnt += 1
