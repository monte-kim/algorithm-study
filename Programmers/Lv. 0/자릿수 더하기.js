function solution(n) {
  var answer = 0;
  answer = n
    .toString()
    .split('')
    .reduce((acc, digit) => {
      //   return (acc += Number(digit));
      return acc + Number(digit);
    }, 0);
  return answer;
}
