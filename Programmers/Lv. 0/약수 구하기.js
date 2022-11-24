function solution(n) {
  var answer = new Set();
  for (let i = 1; i <= Math.sqrt(n); i++) {
    if (n % i === 0) {
      answer.add(i);
      answer.add(n / i);
    }
  }
  answer = [...answer].sort((a, b) => a - b);
  return answer;
}
