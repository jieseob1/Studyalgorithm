# L자 형태로만

current_position = input()
x = ord(current_position[0]) -96 # about small alphabet: 96, Big alphabet: 65
y = int(current_position[1])
print("x,y:",x,y)
cnt = 0

dx = [-1,1,2,2,1,-1,-2,-2]
dy = [2,2,1,-1,-2,-2,-1,1]

for i in range(len(dx)): # until 8
    nx = x +dx[i]
    ny = y + dy[i] # int, str type issue
    if nx <= 0 or ny <= 0 or nx > 8 or ny> 8: # 벗어나는 경우
        continue
    else:
        cnt += 1
print(cnt)
# use ascii code => ord ,chr
