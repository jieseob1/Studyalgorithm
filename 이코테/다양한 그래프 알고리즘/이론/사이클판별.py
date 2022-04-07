def find_parent(parent,x):
    if parent[x] != x:
        parent[x] = find_parent(parent,parent[x])
    return parent[x]

def union_parent(parent, a,b):
    a= find_parent(parent,a)
    b = find_parent(parent,b)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b

v,e = map(int, input().split())

#부모 테이블 초기화
parent = [0] *(v+1) 
#부모 테이블 상에서, 부모를 자기 자신으로 초기화
for i in range(1, v+1):
    parent[i] = i

cycle = False

for i in range(e):
    a,b = map(int ,input().split())
    #사이클이 발생한 경우 종료 
    if find_parent(parent,a) ==  find_parent(parent, b):
        cycle = True
        break
    #사이클이 발생하지 않았다면 합집합(union) 수행
    else:
        union_parent(parent,a,b)
