function solution(a, b) {
  return a.reduce((sum, el, index) => sum + el * b[index], 0);
}

// A: 3
solution([1, 2, 3, 4], [-3, -1, 0, 2]);
