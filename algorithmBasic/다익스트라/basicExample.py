# 우선순위 큐 사용
import heapq # 우선순위 큐 구현을 위함
import sys
input = sys.stdin.readline
INF = int(1e9)

# 노드의 개수, 간선의 개수 입력
n,m = map(int, input().split())
# 그래프과 거리 리스트 필요함
