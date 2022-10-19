function solution(denum1, num1, denum2, num2) {
  var answer = [];
  let a = denum1 * num2 + denum2 * num1;
  let b = num1 * num2;
  answer.push(a / gcd(a, b));
  answer.push(b / gcd(a, b));
  return answer;
}

function gcd(a, b) {
  return b ? gcd(b, a % b) : a;
}
