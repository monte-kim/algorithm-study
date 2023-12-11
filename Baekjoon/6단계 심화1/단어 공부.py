s = list(input().upper())
counts = dict()
for letter in s:
    if letter not in counts:
        counts[letter] = 1
    else:
        counts[letter] += 1
max_value = max(counts.values())
max_key = [key for key, value in counts.items() if value == max_value]
if len(max_key) > 1:
    print('?')
else:
    print(max_key[0])

# 시간 단축 풀이
# s = input().upper()
# counts = [s.count(chr(i)) for i in range(65, 91)]
# max_count = max(counts)
# print('?' if counts.count(max_count) > 1 else chr(counts.index(max_count) + 65))