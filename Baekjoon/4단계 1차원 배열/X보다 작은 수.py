n, x = map(int, input().split())
a = list(map(int, input().split()))
result = []
for num in a:
    if num < x:
        result.append(str(num))
print(' '.join(result))