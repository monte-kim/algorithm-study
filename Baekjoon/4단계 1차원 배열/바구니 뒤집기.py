n, m =map(int, input().split())
arr = list(range(1, n + 1))
for _ in range(m):
    i, j = map(int, input().split())
    temp = arr[i - 1:j]
    temp.reverse()
    arr[i - 1:j] = temp
print(' '.join(map(str, arr)))