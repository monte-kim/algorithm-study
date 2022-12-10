function solution(n) {
  return parseInt(n.toString(3).split('').reverse().join(''), 3);
}

// A: 229
solution(125);
