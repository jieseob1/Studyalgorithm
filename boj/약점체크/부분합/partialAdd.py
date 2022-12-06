#https://www.acmicpc.net/problem/1806
# https://fre2-dom.tistory.com/498
n,s = map(int, input().split()) # n:수열의 길이, s: 부분합 중 그 합이 s이상이 되는 것중, 가장 짧은 것의 길이
data = list(map(int, input().split()))
start= 0
end = 0
mySum = 0
res = 1e9
while True:
    if mySum >= s: # mySum이 S를 넘게 되면
        res= min(res, end- start)
        mySum -= data[start]
        start += 1
    else:
        if end == n:
            break
        mySum += data[end]
        end += 1
        
print(0) if res == 1e9 else print(res)