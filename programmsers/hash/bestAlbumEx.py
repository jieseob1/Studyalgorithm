def solution(genres, plays):
    answer = []
    hash = {}

    # 1. genre에 따라 재생횟수와 고유번호 넣기
    for i in range(len(genres)):  # 장르의 길이만큼 돌면서
        if genres[i] in hash:  # 장르가 해시에 있다면 추가해준다.
            hash[genres[i]].append([plays[i], i])
        else:
            # 장르가  없다면 선언해준다.
            hash[genres[i]] = [[plays[i], i]]
    play_sum = {}

    for genre in hash.keys():  # classic과 pop으로 반복
        musicPlaySum = 0
        songs = hash[genre]  # classic의 경우에는 [500,0], [150, 2], [800, 3]
        for song in songs:  # songs를 각각 돌면서
            musicPlaySum += song[0]
        play_sum[genre] = musicPlaySum
    # 각각의 횟수를 더해서 새로운 해시에 넣어줄 예정
    # 많이 들은 횟수 기준, 3100, 1450
    play_sum = sorted(play_sum.items(), key=lambda x: x[1], reverse=True)

    for genre in play_sum:  # 장르 기준
        song_rank = sorted(hash[genre[0]], key=lambda x: -x[0])
        best_two = 0

        for song in song_rank:
            answer.append(song[1])  # 고유번호를 추가시킨다.
            best_two += 1
            if best_two == 2:
                break
    return answer


genres = ["classic", "pop", "classic", "classic", "pop"]
plays = [500, 600, 150, 800, 2500]
print(solution(genres, plays))
