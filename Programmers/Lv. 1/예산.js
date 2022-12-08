function solution(d, budget) {
  let answer = 0;
  d.sort((a, b) => a - b);
  d.reduce((sum, number) => {
    // eslint-disable-next-line no-param-reassign
    sum += number;
    if (sum <= budget) answer += 1;
    return sum;
  }, 0);
  return answer;
}

// A: 3
solution([1, 3, 2, 5, 4], 9);
