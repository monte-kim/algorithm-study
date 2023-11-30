hour, minute = map(int, input().split())
timer = int(input())

hour += timer // 60
minute += timer % 60

if minute >= 60:
    hour += minute // 60
    minute %= 60
if hour > 23:
    hour = hour % 24

print(f'{hour} {minute}')