function solution(n) {
  let Answer = 0;
  for (let i = 1; i <= Math.floor(Math.sqrt(n)); i += 1) {
    if (i === Math.sqrt(n)) Answer += i;
    else if (n % i === 0) {
      Answer += i;
      Answer += n / i;
    }
  }
  return Answer;
}

// A: 28
solution(12);
