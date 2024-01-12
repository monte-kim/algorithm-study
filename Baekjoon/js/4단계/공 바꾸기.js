const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const [basketCounts, changeCounts] = input[0].split(' ').map(Number);

const ballNumbers = [];
for (let i = 0; i < basketCounts; i += 1) {
  ballNumbers[i] = i + 1;
}

for (let i = 1; i <= changeCounts; i += 1) {
  const [basket1, basket2] = input[i].split(' ').map(Number);
  const temp = ballNumbers[basket1 - 1];
  ballNumbers[basket1 - 1] = ballNumbers[basket2 - 1];
  ballNumbers[basket2 - 1] = temp;
}

console.log(ballNumbers.join(' '));
