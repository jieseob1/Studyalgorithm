n = int(input())
word = {}
for _ in range(n):
    word[input()] = 1
for _ in range(n-1):
    word[input()] = 0

for key, value in word.items():
    if value == 1:
        print(key)
        break
