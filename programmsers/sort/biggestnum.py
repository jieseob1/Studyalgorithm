def solution(numbers):
    my_list = list(map(str, numbers))  # my_list에 str형으로 numbers를 넣어준다.
    my_list.sort(key=lambda x: x * 3, reverse=True)

    return str(int("".join(my_list)))
