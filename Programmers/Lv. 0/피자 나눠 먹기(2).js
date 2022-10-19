function solution(n) {
  var answer = 0;
  answer = (6 * n) / gcd(6, n) / 6;
  return answer;
}
function gcd(a, b) {
  return b ? gcd(b, a % b) : a;
}
