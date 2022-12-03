function solution(n) {
  const squareRoot = Math.sqrt(n);
  return Math.floor(squareRoot) === squareRoot ? (squareRoot + 1) ** 2 : -1;
}

// A: 144
solution(121);
