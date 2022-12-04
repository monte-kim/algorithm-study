function gcd(a, b) {
  return b ? gcd(b, a % b) : a;
}

function solution(n, m) {
  const answer = [];
  const gcdResult = gcd(n, m);
  answer.push(gcdResult);
  answer.push((n * m) / gcdResult);
  return answer;
}

// A: [3, 12]
solution(3, 12);
