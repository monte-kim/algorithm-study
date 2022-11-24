function solution(my_string) {
  var answer = 0;
  const operators = [];
  const numbers = [];
  my_string.split(' ').map((el) => {
    num = Number(el);
    if (isNaN(num)) operators.push(el);
    else numbers.push(num);
  });
  answer = numbers[0];
  operators.forEach((operator, index) => {
    if (operator === '+') answer += numbers[index + 1];
    if (operator === '-') answer -= numbers[index + 1];
  });
  return answer;
  //   return eval(my_string);
}
