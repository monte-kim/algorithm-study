function solution(sides) {
  let max = sides[0] + sides[1];
  let min = Math.abs(sides[0] - sides[1]);
  return max - min - 1;
}
