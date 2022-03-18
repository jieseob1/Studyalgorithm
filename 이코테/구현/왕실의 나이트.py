s = input()
row = int(s[1])
column = int(ord(s[0]))-int(ord('a')) + 1  # 아이디어 -> 문자를 숫자로 바꾸려고 하면 ord를 사용하자

steps = [(-2, -1), (-2, 1), (2, -1), (2, 1),
         (1, 2), (1, -2), (-1, 2), (-1, -2)]
# 따로 갈수 있는 슽베
result = 0
for step in steps:
    next_row = row + step[0]
    next_column = column + step[1]
    if next_row >= 1 and next_row <= 8 and next_column >= 1 and next_column <= 8:
        result += 1

print(result)
