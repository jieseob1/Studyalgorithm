n = int(input())
k = int(input()) # number of apple

apple_pos = []
snake_list = []
for _ in range(k): 
    row,col = map(int,input().split())
    apple_pos.append((row,col)) # 1행 1열에는 사과가 없다

L = int(input()) #변환횟수
for _ in range(L):
    x,c = input().split()
    snake_list((int(x),c)) #'L','D'
