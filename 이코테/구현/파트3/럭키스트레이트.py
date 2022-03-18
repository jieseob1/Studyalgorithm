n = input()  # 점수 N

cnt_left = 0
cnt_right = 0
for i in range(len(n)//2):  # 0부터 2까지
    cnt_left += int(n[i])
for i in range(len(n)//2, len(n)):  # 0부터 2까지
    cnt_right += int(n[i])

if cnt_left == cnt_right:
    print("LUCKY")
else:
    print('READY')
