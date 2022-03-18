def solution(brown, yellow):
    total = brown + yellow  # xy

    for height in range(1, total+1):  # 1부터 total까지 돌면서
        width = total / height
        if width >= height:
            if 2*width + 2*height - 4 == brown:
                return [width, height]


brown = 10
yellow = 2
print(solution(brown, yellow))
