function solution(quiz) {
  var answer = [];
  const results = [];
  quiz.map((el) => {
    const [operation, result] = el.split(' = ');
    if (operation.includes('+')) {
      const numbers = operation.split(' + ').map(Number);
      if (numbers[0] + numbers[1] == result) answer.push('O');
      else answer.push('X');
    } else {
      const numbers = operation.split(' - ').map(Number);
      if (numbers[0] - numbers[1] == result) answer.push('O');
      else answer.push('X');
    }
  });
  return answer;
}
