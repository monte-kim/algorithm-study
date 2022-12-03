function solution(n) {
  const answer = n
    .toString()
    .split('')
    .map(Number)
    .sort((a, b) => b - a)
    .join('');

  return Number(answer);
}

// A: 873211
solution(118372);
