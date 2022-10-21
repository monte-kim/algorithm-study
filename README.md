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

#### - Sieve of Eratosthenes(finding primes)

```
function findPrime(n){
  let prime = Array(n + 1).fill(true).fill(false, 0, 2);  //0 and 1 is not a prime number.
  for(let i = 2; i * i <= n; i++){
    if(prime[i]){
      for(let j = i * i; j <= n; j += i){ //multiples of prime[i] are not prime numbers.
        prime[j] = false;
      }
    }
  }
  return prime.filter((el) => el).length; //returning the count of prime numbers below n.
}
```
