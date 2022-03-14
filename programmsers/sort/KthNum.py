def solution(array, commands):
    answer = []

    for x in range(len(commands)):
        i = commands[x][0]
        j = commands[x][1]
        k = commands[x][2]

        tmp_array = array[i-1: j]
        tmp_array.sort()
        answer.append(tmp_array[k-1])
    return answer


array = [1, 5, 2, 6, 3, 7, 4]
commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
print(solution(array, commands))
