total_price = int(input())
cases = int(input())
price_sum = 0
for _ in range(cases):
    price, amount = map(int, input().split())
    price_sum += price * amount
result = 'Yes' if total_price == price_sum else 'No'
print(result)