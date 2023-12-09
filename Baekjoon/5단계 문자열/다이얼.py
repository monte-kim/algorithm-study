s = list(input())
alphabets = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
result = 0
for letter in s:
    for i in range(len(alphabets)):
        if letter in alphabets[i]:
            result += i + 3
print(result)
    