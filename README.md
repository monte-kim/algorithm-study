# Algorithm

### Euclidean algorithm

#### - Greatest Common Divisor

```
function gcd(a, b){
 return b ? gcd(b, a % b) : a;
}
```

#### - Least Common Multiple

```
function lcm(a,b){
  return a * b / gcd(a,b);
}
```

#### - Factorial(Recursion)

```
function factorial(n) {
	return n > 1? n * factorial(n - 1) : 1;
}
```
