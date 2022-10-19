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
