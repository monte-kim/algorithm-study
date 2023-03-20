const fs = require('fs');

const [king, queen, rook, bishop, knight, pawn] = fs
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split(' ')
  .map(Number);

const result = [];
result.push(1 - king);
result.push(1 - queen);
result.push(2 - rook);
result.push(2 - bishop);
result.push(2 - knight);
result.push(8 - pawn);

console.log(result.join(' '));
