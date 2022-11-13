# L자 형태로만

current_position = input()
x = ord(current_position[0]) -96
y = current_position[1]
cnt = 0

dx = [-1,1,2,2,1,-1,-2,-2]
dy = [2,2,1,-1,-2,-2,-1,1]

for i in range(len(dx)):
    
# use ascii code => ord ,chr
