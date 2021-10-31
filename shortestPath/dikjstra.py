# #다익스트라는 단계마다 방문하지 않은 노드 중 최단 거리가 가장 짧은 노드를 선택하기 위해 매 단계마다 1차원 리스트의 모든 원소를 확인한다.
# #이번 단계는 간단한 다익스트라 알고리즘이다
#
# import sys
# input = sys.stdin.readline()
# INF = int(1e9)
# #무한대는 int(1e9)로 설정한다
#
# #노드의 개수,간선의 개수를 입력받는다
# n,m = map(int, input().split())
# #시작 노드 번호 입력받기
# start = int(input())
# #각 노드에 연결되어 있는 노드에 대한 정보를 담는 리스트 만들기
# graph = [[] for i in range(n+1)]
# #방문한 적이 있는지 체크하는 목적의 리스트 만들기
# visited = [False] * (n+1)
# #최단 거리 테이블을 모두 무한으로 초기화
#
# distance = [INF] *(n+1)
#
# #모든 간선 정보를 입력받기
# for _ in range(m):
#     a,b,c  map