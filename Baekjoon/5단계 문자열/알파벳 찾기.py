s = input()
result = [-1] * 26
for i in range(len(s)):
    if result[ord(s[i]) - ord('a')] == -1:
        result[ord(s[i]) - ord('a')] = i

print(' '.join(map(str, result)))