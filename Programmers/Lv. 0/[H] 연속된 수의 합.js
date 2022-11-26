function solution(num, total) {
  var answer = [];
  for (let i = 0; i < num; i++) {
    answer.push(i);
  }
  let totalSum = -1;
  while (totalSum !== total) {
    if (totalSum > total) answer = answer.map((number) => number - 1);
    else if (totalSum < total) answer = answer.map((number) => number + 1);
    totalSum = answer.reduce((sum, number) => sum + number, 0);
  }
  return answer;
}
