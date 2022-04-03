def dfs(L,sum, time):
    global res
    if time > m:
        return 
    if L == n: # level이 n과 같아진 경우
        if sum > res: # 만약 sum이 res보다 커지게 되면
            res = sum
    else:
        dfs(L+1, sum + pv[L], time+pt[L])
        dfs(L+1, sum, time)



n,m = map(int, input().split())
# n: 문제의 개수 ,m: 제한 시간
pv = list() #problem value
pt = list() #problem time
for _ in range(n):
    a,b = map(int, input().split())
    pv.append(a)
    pt.append(b) # 문제 점수 리스트와 문제 시간 리스트에 값을 각각 넣어준다.
res = -21470000 #결과
dfs(0,0,0)