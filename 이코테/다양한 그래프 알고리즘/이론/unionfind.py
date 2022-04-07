# 특정 원가 속한 집합 찾기 
def find_parent(parent, x):
    #만약 루트 노드가 아니라면, 루트 노드를 찾을 때까지 재귀적으로 호출
    if parent[x] != x: # 노드번호랑 부모번호랑 다를 경우->루트 노드가 아님
        parent[x] = find_parent(parent,parent[x])
    return parent[x]
#두 원소가 속한 집합 합치기
def union_parent(parent,a ,b):
    a = find_parent(parent,a)
    b = find_parent(parent,b)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b
