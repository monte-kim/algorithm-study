byte = int(input())
result = ''
for _ in range(byte // 4):
    result += 'long '
result += 'int'
print(result)