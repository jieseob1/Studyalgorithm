def dfs(L,sum):
    global cnt
    if L == k: #l이 동전의 개수가 된다면
        if sum == t:
            cnt += 1
    else:
        for i in range(cn[L]+1): #동전의 개수만큼 for문이 돈다. 
            #cn의 L번까지 돌아야 하므로 마지막에 +1을 더해준다.
            dfs(L+1, sum+(cv[L]*i)) #cv[L]은 동전의 금액 -> i가 2이면 2개 사용하겠다.  



t= int(input()) # 지폐의 금액
k = int(input())#동전의 가지 수
cv = list() # 5 10 1
cn = list()# 
for _ in range(k):
    a,b = map(int,input().split())
    cv.append(a) # 동전의 금액
    cn.append(b)
cnt = 0
dfs(0,0)
