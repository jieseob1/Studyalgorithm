def solution(bridge_length, weight, truck_weights):
    cnt = 0
    bdg_len = 0
    # truck_weights: 대기 트럭
    before_cross_bridge = []
    while truck_weights:  # sum이 0이 되거나 그 이하가 되면 끝
        # 다리를 건너는 트럭이 weight보다 작으면
        if sum(before_cross_bridge) + truck_weights[0] <= weight:
            tmp = truck_weights.pop(0)
            before_cross_bridge.append(tmp)  # 대기트럭에서 하나 빼냄
            cnt += 1  # 시간초
            bdg_len += 1  # bridge_length를 재기 위함
            print("bdg_len,cnt:", bdg_len, cnt)
        else:  # 다리를 건너는 트럭이 weight보다 큰 경우
            if bdg_len == bridge_length:
                before_cross_bridge.pop(0)
                bdg_len = 0
                print("bdg_len:", bdg_len)
            else:
                cnt += 1
    cnt += bridge_length
    print(cnt)


bridge_length = 2
weight = 10
truck_weights = [7, 4, 5, 6]

solution(solution(bridge_length, weight, truck_weights))
