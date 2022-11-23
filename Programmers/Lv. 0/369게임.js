function solution(order) {
  var answer = 0;
  order
    .toString()
    .split('')
    .map((digit) => {
      if (Number(digit) % 3 === 0 && digit !== '0') answer++;
    });
  // answer = order.toString().split('')
  //     .filter((digit) => {
  //     return ['3','6','9'].includes(digit);
  // }).length;
  return answer;
}
