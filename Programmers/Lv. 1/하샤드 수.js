function solution(x) {
  const digitSum = x
    .toString()
    .split('')
    .map(Number)
    .reduce((sum, num) => sum + num, 0);
  return x % digitSum === 0;
}

// A: false
solution(13);
