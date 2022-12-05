function solution(x, n) {
  const answer = [];
  for (let i = 1; i <= n; i += 1) {
    answer.push(x * i);
  }
  return answer;
}

// A: [-4, -8];
solution(-4, 2);
