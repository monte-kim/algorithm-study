N = int(input())
for i in range(1, 2 * N):
    blank = abs(N - i)
    print(' ' * blank + '*' * abs(2 * N - 1 - 2 * blank))