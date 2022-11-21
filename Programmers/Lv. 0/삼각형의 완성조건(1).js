function solution(sides) {
  // sides.sort((a,b) => {
  //     return b - a;
  // });
  // if(sides[0] >= sides[1] + sides[2]) return 2;
  // return 1;
  maxSide = Math.max(...sides);
  sumSides =
    sides.reduce((sum, el) => {
      return sum + el;
    }, 0) - maxSide;
  if (sumSides > maxSide) return 1;
  return 2;
}
