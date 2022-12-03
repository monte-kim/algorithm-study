function solution(n) {
  return n
    .toString()
    .split('')
    .reduce((sum, number) => sum + Number(number), 0);
}

// A: 24
solution(987);
