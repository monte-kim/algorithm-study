function solution(a, b) {
  var answer = 0;
  if (gcd(a, b) !== 1) b /= gcd(a, b);
  while (b > 0) {
    if (b % 2 === 0) b /= 2;
    if (b % 5 === 0) b /= 5;
    if (b % 2 !== 0 && b % 5 !== 0) break;
  }
  if (b !== 1) return 2;
  else return 1;
}

function gcd(a, b) {
  return b ? gcd(b, a % b) : a;
}
