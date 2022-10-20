function solution(balls, share) {
  // let factorial = [BigInt(1)];
  // for(let i = 1; i <= balls; i++)
  //     factorial[i] = factorial[i - 1] * BigInt(i);
  // 동적계획법
  // return factorial[balls] / (factorial[balls - share] * factorial[share]);
  return factorial(balls) / (factorial(balls - share) * factorial(share));
}
function factorial(n) {
  let f = BigInt(1);
  for (let i = n; i > 1; i--) {
    f *= BigInt(i);
  }

  return f;
}
