students = [0] * 30
for _ in range(28):
    i = int(input())
    students[i - 1] = i
for i, value in enumerate(students):
    if value == 0:
        print(i + 1)