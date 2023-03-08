const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const [numbers, inputLength] = input[0].split(' ').map(Number);

const ballNumbers = new Array(numbers);
ballNumbers.fill(0);

for (let i = 1; i <= inputLength; i += 1) {
  const [basket1, basket2, ball] = input[i].split(' ').map(Number);
  for (let j = basket1 - 1; j <= basket2 - 1; j += 1) {
    ballNumbers[j] = ball;
  }
}

console.log(ballNumbers.join(' '));
