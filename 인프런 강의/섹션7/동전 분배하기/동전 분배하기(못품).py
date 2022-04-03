def dfs(L):
    global res
    if  L == n: # n에 가까워지면
        cha = max(money) - min(money)
        if cha < res:#cha가 기존 res보다 작을때 답이 된다.
            tmp = set()
            for x in money:
                tmp.add(x) #길이가 모두 달라야지 3개가 들어간다.
            if len(tmp) == 3:
                res = cha

    else:
        for i in range(3): #3명
            money[i] += coin[L] 
            print(money)
            dfs(L+1)
            money[i] -= coin[L]

     

n = int(input()) # 동전의 개수
coin = []
for _ in range(n):
    coin.append(int(input()))
#n줄에 걸쳐 각 동전의 금액이 주어진다.
money = [0] * 3
res = 2147000000

dfs(0)