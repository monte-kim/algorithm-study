import sys

a = int(sys.stdin.readline().strip())
b = int(sys.stdin.readline().strip())

digitOne = (b % 10)
digitTen = (b % 100 // 10)
digitHundred = b // 100

print(a * digitOne)
print(a * digitTen)
print(a * digitHundred)
print(a * b)