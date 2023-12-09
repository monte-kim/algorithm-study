a, b = input().split()
numA = int(''.join(reversed(a)))
numB = int(''.join(reversed(b)))
print(numA) if numA > numB else print(numB)