def solution(genres, plays):
    answer = []
    hash = {}

    for i in range(len(genres)):
        if genres[i] in hash:  # hash안에 genres가 들어가 있다면
            hash[genres[i]].append([plays[i], i])  # 클래식이였다면 클래식에 append를 시켜준다
        else:
            hash[genres[i]] = [[plays[i], i]]

    genre_rank = {}
    for genre in hash.keys():  # classic pop
        songs = hash[genre]  # songs = classic
        plays_sum = 0
        for song in songs:
            plays_sum += song[0]
        genre_rank[genre] = plays_sum  # classic에다가 plays_sum을 넣는다.
    # 합산 숫자가 들어가 있다.
    genre_rank = sorted(genre_rank.items(), key=lambda x: x[1], reverse=True)

    for genre in genre_rank:
        song_rank = sorted(hash[genre[0]], key=lambda x: (-x[0], x[1]))
        best_two = 0

        for song in song_rank:
            answer.append(song[1])
            best_two += 1
            if best_two == 2:
                break
    return answer


genres = ["classic", "pop", "classic", "classic", "pop"]
plays = [500, 600, 150, 800, 2500]

print(solution(genres, plays))
