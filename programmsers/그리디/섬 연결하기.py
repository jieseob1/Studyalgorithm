def solution(n, costs):
    answer = 0
    costs.sort(key=lambda x: x[2])  # 비용을 기준으로 정렬
    routes = set([costs[0][0]])  # 집합으로 시작지점 설정
    while len(routes) != n:  # routes의 길이가 n이되면 종료
        for idx, cost in enumerate(costs):
            if cost[0] in routes and cost[1] in routes:  # 시작지점과 끝지점이 routes 안에 들어가 있으면
                continue  # 다음 for문으로 넘어가고
            if cost[0] in routes or cost[1] in routes:  # 둘중 하나만 들어가 있다면
                routes.update([cost[0], cost[1]])  # 시작지점과 끝지점을 더해주고
                answer += cost[2]  # answer부분에는 비용을 넣어준다.
                costs[idx] = [-1, -1, -1]  # 그리고 costs[idx] 부분은 -1-1-1로 만들어준다.
                break

    return answer


n = 4
costs = [[0, 1, 1], [0, 2, 2], [1, 2, 5], [1, 3, 1], [2, 3, 8]]
print(solution(n, costs))
