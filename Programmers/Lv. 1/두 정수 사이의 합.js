function solution(a, b) {
  return a < b ? (b * (b + 1) - a * (a - 1)) / 2 : (a * (a + 1) - b * (b - 1)) / 2;
}
