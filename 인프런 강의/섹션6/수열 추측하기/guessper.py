#데이터를 가지고 와서 합을구해주는 부분 
import sys


def dfs(L,sum):
    if L == n and sum == f: # 합이 f가 될 때    L이 n까지 가게되면 종료지점이 된다.
        for i in p:
            print(i, end=' ')
        sys.exit(0) #한줄만 나오게 하고 바로 끝내게 하기
    else:
        for i in range(1, n+1):
            # 원소가 되면서 순열을 만드는 과정
            if ch[i] == 0: # 중복방지 과정
                ch[i] = 1 # 사용했으므로 체크해준다.
                p[L] = i
                #순열 만드는중
                dfs(L+1 ,sum + (p[L]*b[L])) 
                ch[i] = 0
-

    

n,f = map(int, input().split())
p = [0] * n
b = [1] * n #n에 따라 초기화만 잘 해주면 된다.
ch =[0] * (n+1)

for i in range(1,n):
    b[i] =(b[i-1] *(n-i)) / i #수학적으로 조합 생각해서 구현하기
dfs(0,0)

#규칙: b[i] = (b[i-1] * (n-i) )/i
# 