# def counterLetters(word):
#     counter = {}
#     for letter in word:
#         if letter not in counter:
#             counter[letter] = 0
#             break
#             print("counter:",counter)
#         counter[letter] += 1
        
#     return counter

# print(counterLetters('hello world'))

from collections import Counter

def find_max(word):
    counter = Counter(word)
    max_count = -1
    for letter in word:
        if counter[letter] > max_count:
            max_count = counter[letter]
            max_letter = letter
    return max_letter, max_count

print(find_max('hello world')) # ('l', 3)