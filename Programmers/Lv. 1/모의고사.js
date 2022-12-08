function solution(answers) {
  const num1 = [1, 2, 3, 4, 5]; // 5
  const num2 = [2, 1, 2, 3, 2, 4, 2, 5]; // 8
  const num3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]; // 10

  const scores = answers.reduce(
    (sum, answer, index) => {
      // eslint-disable-next-line no-param-reassign
      if (num1[index % num1.length] === answer) sum[0] += 1;
      // eslint-disable-next-line no-param-reassign
      if (num2[index % num2.length] === answer) sum[1] += 1;
      // eslint-disable-next-line no-param-reassign
      if (num3[index % num3.length] === answer) sum[2] += 1;
      return sum;
    },
    [0, 0, 0],
  );

  const maxScore = Math.max(...scores);

  return scores
    .map((el, index) => {
      if (el === maxScore) return index + 1;
      return false;
    })
    .filter((el) => Number(el) !== 0);
}

// A: [1, 2, 3]
solution([1, 3, 2, 4, 2]);
