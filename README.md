# Algorithm

> - #### 최대공약수(유클리드 호제법)<sup>greatest common divisor(Euclidean algorithm)</sup>
>
> ```
> function gcd(a, b){
> return b ? gcd(b, a % b) : a;
> }
> ```
>
> ```
> function gcd2(int a, int b){
>  int tmp;
>  while(b){
>    tmp = a % b;
>    a = b;
>    b = c;
>  }
>  return a;
> }
> ```

> - #### 최소공배수<sup>least common multiple</sup>
>
> ```
> function lcm(a,b){
>  return a * b / gcd(a,b);
> }
> ```

> - #### 팩토리얼(재귀)<sup>factorial(recursion)</sup>
>
> ```
> function factorial(n) {
> 	return n > 1? n * factorial(n - 1) : 1;
> }
> ```

> - #### 소수 찾기(에라토스테네스의 체)<sup>find prime numbers(sieve of Eratosthenes)</sup>
>
> ```
> function findPrime(n){
>  let prime = Array(n + 1).fill(true).fill(false, 0, 2);  //0 and 1 is not a prime number.
>  for(let i = 2; i * i <= n; i++){
>    if(prime[i]){
>      for(let j = i * i; j <= n; j += i){ //multiples of prime[i] are not prime numbers.
>        prime[j] = false;
>      }
>    }
>  }
>  return prime.filter((el) => el).length; //returning the count of prime numbers below n.
> }
> ```

> - #### 순열과 조합<sup>permutaion & combination</sup>
>
>   > - 순열<sup>permutation</sup>
>   >
>   > ```
>   > const getPermutations = (array, selectNumber) => {
>   >  const results = [];
>   >  if (selectNumber === 1) {
>   >    return array.map((element) => [element]);
>   >  }
>   >  array.forEach((fixed, index, origin) => {
>   >    const rest = [...origin.slice(0, index), ...origin.slice(index + 1)];
>   >    const permutations = getPermutations(rest, selectNumber - 1);
>   >    const attached = permutations.map((permutation) => [fixed, ...permutation]);
>   >
>   >    results.push(...attached);
>   >  });
>   >  return results;
>   > };
>   > ```
>
>   > - 조합<sup>combination</sup>
>   >
>   > ```
>   > function getCombinations(array, selectNumber) {
>   >    const results = [];
>   >    if(selectNumber === 1){
>   >        return array.map((element) => [element]);
>   >    }
>   >    array.forEach((fixed, index, origin) => {
>   >        const rest = origin.slice(index+1);
>   >        const combinations = getCombinations(rest, selectNumber - 1);
>   >        const attached = combinations.map((combination) => [fixed, ...combination]);
>   >        results.push(...attached);
>   >    });
>   >    return results;
>   > }
>   > ```
