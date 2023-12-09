from functools import reduce
T = int(input())
for _ in range(T):
    R, S = input().split()
    result = reduce(lambda x, y: x + y, map(lambda x: x * int(R), S))
    print(result)