remainders = []
for _ in range(10):
    a = int(input())
    remainder = a % 42
    if remainder not in remainders:
        remainders.append(remainder)
print(len(remainders))