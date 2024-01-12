const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

input.shift();
const result = input.map((el) => {
  const [times, word] = el.split(' ');
  const oneResult = word.split('').reduce((acc, letter) => acc + letter.repeat(Number(times)), '');
  return oneResult;
});

console.log(result.join('\n'));
