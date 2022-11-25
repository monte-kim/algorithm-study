function solution(num, k) {
  var answer = 0;
  answer = num.toString().split('').indexOf(k.toString()) + 1;
  if (answer === 0) return -1;
  return answer;
}
