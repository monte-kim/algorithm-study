function solution(money) {
  var answer = [];
  let cups = parseInt(money / 5500);
  answer.push(cups);
  answer.push(money - cups * 5500);
  return answer;
}
