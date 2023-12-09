from functools import reduce
n = int(input())
numbers = list(input())
result = reduce(lambda x, y: int(x) + int(y), numbers)
print(result)

# input()
# print(sum(map(int, input())))