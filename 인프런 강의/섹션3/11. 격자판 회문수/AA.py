a = [list(map(int, input().split())) for _ in range(7)]
# # 가로방향 또는 세로방향으로 길이 5자리 회문수가 몇 개 있는지 구하기

# cnt = 0
# for i in range(7):
#     for j in range(3):
#         tmp = []
#         tmp2 = []
#         for k in range(5):
#             # 행의 경우
#             tmp.append(a[i][j+k])
#             # 열의 경우
#             tmp2.append(a[j+k][i])
#         if tmp == tmp[::-1]:
#             cnt += 1
#         if tmp2 == tmp2[::-1]:
#             cnt += 1
# print(cnt)


# 소스 코드
cnt = 0
for i in range(7):
    for j in range(3):
        tmp = a[i][j:j+5]  # slicing 사용
        if tmp == tmp[::-1]:
            cnt += 1
        for k in range(5//2):
            if tmp[j+k][i] != tmp[j+5-k-1][i]:
                break
            else:
                cnt += 1
