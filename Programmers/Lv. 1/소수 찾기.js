function solution(n) {
  var answer = 0;
  let prime = Array(n + 1)
    .fill(true)
    .fill(false, 0, 2);
  for (let i = 2; i * i <= n; i++) {
    for (let j = i * i; j <= n; j += i) {
      prime[j] = false;
    }
  }
  answer = prime.filter((el) => el).length;
  return answer;
}
