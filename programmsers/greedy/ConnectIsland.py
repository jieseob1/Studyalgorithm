def solution(n, costs):
    ans = 0
    costs.sort(key=lambda x: x[2])  # cost 기준으로 오름차순 정렬
    routes = set([costs[0][0]])  # 연결을 확인하는 집합
    while len(routes) != n:  # 라우트의 길이가 n이 될때까지 계속 반복
        for i, cost in enumerate(costs):
            if cost[0] in routes and cost[1] in routes:  # routes 안에 0이 있고 cost[1]이 들어가 있으면
                continue  # 계속 한다
            if cost[0] in routes or cost[1] in routes:  # 둘중 하나만 연결되어있다면
                routes.update([cost[0], cost[1]])  # 값을 한꺼번에 추가 한다.
                ans += cost[2]
                costs[i] = [-1, -1, -1]
                break
    print(ans)


costs = [[0, 1, 1], [0, 2, 2], [1, 2, 5], [1, 3, 1], [2, 3, 8]]
n = 4

solution(n, costs)
