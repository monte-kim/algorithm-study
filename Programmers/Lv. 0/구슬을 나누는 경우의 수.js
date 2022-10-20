function solution(balls, share) {
  return factorial(balls) / (factorial(balls - share) * factorial(share));
}
function factorial(n) {
  let f = BigInt(1);
  for (let i = n; i > 1; i--) {
    f *= BigInt(i);
  }
  return f;
}
