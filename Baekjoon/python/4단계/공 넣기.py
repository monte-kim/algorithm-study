n, m = map(int, input().split())
result = [0] * n
for _ in range(m):
    i, j, k = map(int, input().split())
    for l in range(i - 1, j):
        result[l] = k
result = map(str, result)
print(' '.join(result))